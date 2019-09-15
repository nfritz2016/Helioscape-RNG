# Java VM RNG README

## Install Java
- `sudo apt-get install default-jdk`.
- Run `java -version` to verify install.

## Install and Configure Tomcat
- Create Tomcat group by executing `sudo groupadd tomcat`.
- Create a user and add to group with `sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat`.
- `cd /tmp`.
- Download the latest version oof Tomcat here: http://tomcat.apache.org/download-80.cgi
- `curl -O <URL for the tar for the latest version of Tomcat 8>`.
- Update permissions with `sudo chgrp -R tomcat /opt/tomcat`, `sudo chmod -R g+r conf`, and `sudo chmod g+x conf`.
- Get Java version from `sudo update-java-alternatives -l`.
- Use `sudo nano /etc/systemd/system/tomcat.service` to create the tomcat.service file then copy and paste this to the file:
```
    [Unit]
    Description=Apache Tomcat Web Application Container
    After=network.target

    [Service]
    Type=forking

    Environment=JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre
    Environment=CATALINA_PID=/opt/tomcat/temp/tomcat.pid
    Environment=CATALINA_HOME=/opt/tomcat
    Environment=CATALINA_BASE=/opt/tomcat
    Environment='CATALINA_OPTS=-Xms512M -Xmx1024M -server -XX:+UseParallelGC'
    Environment='JAVA_OPTS=-Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom'

    ExecStart=/opt/tomcat/bin/startup.sh
    ExecStop=/opt/tomcat/bin/shutdown.sh

    User=tomcat
    Group=tomcat
    UMask=0007
    RestartSec=10
    Restart=always

    [Install]
    WantedBy=multi-user.target
```
- Ensure the `JAVA_HOME` value is the same as returned in the previous command.

## Running Tomcat
- Execute `sudo systemctl daemon-reload`.
- Use `sudo systemctl start tomcat` to start the Tomcat service.
- Verify the status of the service using `sudo systemctl status tomcat`.
- At this point, you can visit `http://<EXTERNAL_IP>:8080` and see the default Tomcat page.

## Deploying the RNG Page to Tomcat
- Download our `javaapp-1.0-SNAPSHOT.war` file from our github.
- Place the `javaapp-1.0-SNAPSHOT.war` in `/opt/tomcat/webapps` and restart the service by using `sudo systemctl restart tomcat`.
- You can now visit the page by visiting `http://<EXTERNAL_IP>:8080/<NAME_OF_.WAR>`.

*Ensure that your firewall allows ingress connection to port 8080 at priority 0*

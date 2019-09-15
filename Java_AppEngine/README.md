# Java AppEngine Instructions
Once app engine is created, follow the instructions in the link below to install maven framework.

During these instructions, follow the appengine-skeleton-archetype implementation of the installation.
Ensure you have jdk installed.
https://cloud.google.com/appengine/docs/standard/java/tools/using-maven

Once this process has been executed make the following changes to the files:
NOTE: "myapp" and "mycompany" are subject to change based on your version of the implementation. These files may or may not be included.

1. Replace the file located in /myapp/src/main/java/com/mycompany/myapp/HelloAppEngine.java with the RandomAppEngine.java file located in the repository.
2. Replace the file located in /myapp/src/main/webapp/index.jsp with the index.jsp file located in the repository.
3. Delete or comment out the test file loacted in /myapp/src/test/java/com/mycompany/myapp/HelloAppEngineTest.java.

Once this is done, the deployment of the app should be running.
Restarting of the app engine may be neccessary.

If Errors occur consult the pom.xml file or associated README.md's 



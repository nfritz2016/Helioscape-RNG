# Python RNG and Flask Server 

## Python VM Setup

Start and connect to the VM and run:
```sh
git clone https://github.com/nfritz2016/Helioscape-RNG.git
cd Python_VM
pip3 install -r requirements.txt
python3 -m FlaskServer
```

- Go to the firewall settings and 
allow port 5000 to accept http connections

## App Engine Setup: 
1. Go the cloud console and enable the app engine
2. Run the following commands in the Google cloud console 

```sh
git clone https://github.com/nfritz2016/Helioscape-RNG.git
cd Python_VM
gcloud app deploy app.yaml
```

## Usage

- View the VM website at http://146.148.67.80:5000/
- View the app engine website at https://eastern-moment-252617.appspot.com/





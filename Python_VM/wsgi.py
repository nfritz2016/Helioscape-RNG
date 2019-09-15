# Note: I only added this file for people that are running Gunicorn for their WSGI
# To Test A Gunicorn WSGI server, make sure that you are in the current directory and run:
# gunicorn --bind 0.0.0.0:5000 wsgi:app
# To check that it worked, go to localhost:5000 or 127.0.0.1:5000 on your browser.

from FlaskServer import app

if __name__ == "__main__":
    app.run()


from flask import Flask, render_template, request, make_response, redirect, url_for, jsonify
import rng

app = Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def render_home():
    random_number = rng.raj()[1][0]
    return render_template('home.html', number=random_number)

if __name__ == '__main__':
    app.run(debug=False, host='0.0.0.0', port=5000)

@app.route('/json')
def render_json():
    random_number = rng.raj()[1][0]
    number_json = {"random_number" : random_number}
    return jsonify(number_json)
    # return render_template('home.html', number=random_number)

if __name__ == '__main__':
    app.run(debug=False, host='0.0.0.0', port=5000)
    # app.run(debug=False, port=5000)




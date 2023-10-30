# PostRequest_Android
Post request to a url, passing params with label and waiting for a response. Android app in Java

# Setup
* Add file PutUtility and ServiceLogin to your folder:

![Immagine 2023-10-30 121555](https://github.com/Duss02/PostRequest_Android/assets/87281404/a523d425-2ae1-4e14-88bf-33cd2a57e17a)

* In your MainActivity call:
```js
new ServiceLogin().execute( your_params );
```

* In ServiceLogin change "https://www.youurl.com" to your url where you want to send the data and change label to params using:
```js
put.setParam("Label", params[0].toString());
```





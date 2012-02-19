#TiWebViewUserAgentiOS Module

tv.harukaze.ti.webview.useragent.ios

## Description

This Module  is to customize WebView's UserAgent (iOS).

## Accessing the tvharukazetiwebviewuseragentios Module

To access this module from JavaScript, you would do the following:

	var module = require("tv.harukaze.ti.webviewuseragent.ios");

The module variable is a reference to the Module object.	

## Reference


### ___PROJECTNAMEASIDENTIFIER__.function

### ___PROJECTNAMEASIDENTIFIER__.property

## Usage

	// open a single window
	var window = Ti.UI.createWindow({
		backgroundColor:'white'
	});
	
	// TODO: write your module tests here
	var tiwebviewuseragentios = require('tv.harukaze.ti.webviewuseragent.ios');
	Ti.API.info("module is => " + tiwebviewuseragentios);
	tiwebviewuseragentios.setWebViewUserAgent('your own user agent string');
	
	var webview = Ti.UI.createWebView({
		width:'auto',height:'auto',
		url:'http://env.harukaze.tv/'
	});
	
	window.add(webview);
	window.open()
	

## Author

Tomoya Narita (@harukazepc)
<sphone@harukaze.tv>

## License

MIT License
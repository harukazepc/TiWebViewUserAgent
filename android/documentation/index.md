#TiWebViewUserAgentAndroid Module

tv.harukaze.ti.webview.useragent.android

## Description

This Module  is to customize WebView's UserAgent (Android).

## Accessing the tiwebviewuseragentandroid Module

To access this module from JavaScript, you would do the following:

	var module = require("tv.harukaze.ti.webview.useragent.android");

The module variable is a reference to the Module object.	

## Reference

### ___PROJECTNAMEASIDENTIFIER__.function

### ___PROJECTNAMEASIDENTIFIER__.property.

## Usage

	// open a single window
	var window = Ti.UI.createWindow({
		backgroundColor:'white'
	});
	var webView = Ti.UI.createWebView({
		url:'http://env.harukaze.tv/', 
		width: 'auto', height:'auto'
	});
	
	// TODO: write your module tests here
	var tiwebviewuseragent = require('tv.harukaze.ti.webview.useragent.android');
	Ti.API.info("module is => " + tiwebviewuseragent);
	
	if (Ti.Platform.name == "android") {
	    tiwebviewuseragent.setWebViewUserAgent(webView,'your own user agent string');
		Ti.API.debug(tiwebviewuseragent.getWebViewUserAgent(webView));
	}
	
	window.add(webView);
	window.open();
	

## Author

Tomoya Narita (@harukazepc)
<sphone@harukaze.tv>

## License

MIT License

TiWebViewUserAgentAndroid
===========================================

This Module  is to customize WebView's UserAgent (Android).
*) Since Titanium Mobile SDK 1.8, it is recommended to using Ti.UI.WebView#setUserAgent().

HOW TO USE IT
-----------------------------

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
	
NOTICE
------

You must set your UserAgent String before showing a Ti.UI.WebView object at your Window.


QUICK INSTALL TiWebViewUserAgentAndroid
--------------------

0. Download this module Project
1. Copy `dist/modules` folder into your Titanium Project ( ROOT/modules )

(OPTIONAL) INSTALL TiWebViewUserAgentAndroid
--------------------

0. Download this module project
1. Check `build.properties` file and replace the path of SDKs
2. From command line, run this inside your module project:
	% ant run
3. Copy this zip file (at `dist` folder) into the folder of your Titanium Project
4. If you build the titanium project, the zip will be unziped and placed to you module folder


REGISTER TO YOUR PROJECT
---------------------

Register your module with your application by editing `tiapp.xml` and adding your module.
Example:

	<modules>
		<module version="0.1" platform="android">tv.harukaze.ti.webview.useragent.android</module>
	</modules>

When you run your project, the compiler will know automatically compile in your module
dependencies and copy appropriate image assets into the application.


LICENSE
---------------------
MIT License

Copyright 2012 Tomoya Narita 
http://harukaze.tv/
http://d.hatena.ne.jp/harukazepc/
Twitter: @harukazepc
// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


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



// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


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

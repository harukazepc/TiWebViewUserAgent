/**
 * Copyright 2012 Tomoya Narita
 *  http://harukaze.tv/
 *  http://d.hatena.ne.jp/harukazepc/
 *  Twitter: @harukazepc
 *
 * This module is licensed under the MIT License
 *
 * Appcelerator Titanium is Copyright (c) 2009-2010 by Appcelerator, Inc.
 * and licensed under the Apache Public License (version 2)
 */
package tv.harukaze.ti.webview.useragent.android;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiContext;

import ti.modules.titanium.ui.WebViewProxy;
import ti.modules.titanium.ui.widget.webview.TiUIWebView;

@Kroll.module(name="Tvharukazetiwebviewuseragentandroid", id="tv.harukaze.ti.webview.useragent.android")
public class TvharukazetiwebviewuseragentandroidModule extends KrollModule
{
	
	public TvharukazetiwebviewuseragentandroidModule(TiContext tiContext) {
		super(tiContext);
	}
	
	@Kroll.method
	public static void setWebViewUserAgent(WebViewProxy webViewProxy, String userAgent)
	{
		TiUIWebView currWebView = webViewProxy.getWebView();
		if (currWebView != null) {
			//currWebView.setUserAgentString(userAgent);
			currWebView.getWebView().getSettings().setUserAgentString(userAgent);
		}
	}
	
	@Kroll.method
	//@Kroll.getProperty
	public static String getWebViewUserAgent(WebViewProxy webViewProxy)
	{
		TiUIWebView currWebView = webViewProxy.getWebView();
		return (currWebView != null) ? currWebView.getWebView().getSettings().getUserAgentString() : "";
	}
	
}

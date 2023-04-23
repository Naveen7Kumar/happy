package com.test;

import com.base.BaseClass;

public class Task1 extends BaseClass {
	public static void main(String[] args) {

		browserLaunch("www.facebook.com");
		currentUrl();
		title();
		quitBrowser();

	}

}

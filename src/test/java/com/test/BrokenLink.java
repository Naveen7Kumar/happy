package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class BrokenLink extends BaseClass {

	@Test
	private void tc1() throws IOException {
	 browserLaunch("https://www.deadlinkchecker.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		// System.out.println("Total Links"+links.size());

		for (WebElement w : links) {

			String allLinks = w.getAttribute("href");
			// System.out.println(allLinks);

			// create an instance for URL
			URL url = new URL(allLinks);

			// Open the connection to server
			URLConnection urlConnection = url.openConnection();

			// To send the request to the server
			HttpURLConnection httpUrlConnection = (HttpURLConnection) urlConnection;

			// Connect to the server
			httpUrlConnection.connect();

			if (httpUrlConnection.getResponseCode() == 200) {
				System.out.println(allLinks + "-" + httpUrlConnection.getResponseMessage());
			} else {
				System.err.println(allLinks + "-" + httpUrlConnection.getResponseCode() + "-"
						+ httpUrlConnection.getResponseMessage());

			}

		}

	}

}

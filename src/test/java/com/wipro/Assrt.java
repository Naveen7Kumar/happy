package com.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assrt {

	@Test
	private void test1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		String url = driver.getCurrentUrl();
		System.out.println(url);

		Assert.assertEquals(url, "https://www.amazon.in/");
		driver.getTitle();

		driver.quit();
	}
	@Test
	private void test2() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);

		SoftAssert s = new SoftAssert();
		s.assertEquals(url1, "https://www.flipkart.com/");
		
		driver.getTitle();
		
		s.assertAll();

		driver.quit();
	}

	

}

package com.wipro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSug {

	@Test
	private void test1() throws InterruptedException {

		
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gLFyf")).sendKeys("Chennai");
		Thread.sleep(3000);
		List<WebElement> auto = driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
		int size = auto.size();
		System.out.println("Size is : "+size);
		auto.get(size-5).click();
		
		
		/*
		 * driver.findElement(By.className("gLFyf")).sendKeys("chennai");
		 * Thread.sleep(3000); List<WebElement> autoSuggest =
		 * driver.findElements(By.xpath("//*[@class='G43f7e']//li")); int size =
		 * autoSuggest.size(); System.out.println("size is :"+size);
		 * autoSuggest.get(size-1).click();
		 */
		

	}

}

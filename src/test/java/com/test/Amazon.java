package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		WebElement mobile = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		Actions a = new Actions(driver);

		a.moveToElement(mobile).perform();

		a.contextClick().perform();

		Robot r = new Robot();

		for (int i = 0; i <= 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);

			r.keyRelease(KeyEvent.VK_DOWN);
		}


		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.quit();

	}

}
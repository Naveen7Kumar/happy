package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookMaven {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
		userName.sendKeys("1234567891");

		driver.findElement(By.xpath("//*[@type='password']"));

		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_CAPS_LOCK);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_I);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyPress(KeyEvent.VK_1);
//		r.keyPress(KeyEvent.VK_2);
//		r.keyPress(KeyEvent.VK_3);
//
//		driver.findElement(By.xpath("//*[@name='login']"));
//
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_ENTER);

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_A);

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_C);

		driver.findElement(By.xpath("//*[@type='password']"));
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);


		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyRelease(KeyEvent.VK_V);

	}

}

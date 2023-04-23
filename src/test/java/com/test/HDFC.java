package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.switchTo().frame(0);

		WebElement a = driver.findElement(By.xpath("//*[@name='fldLoginUserId']"));
		a.sendKeys("Naveen");

		String s = a.getAttribute("value");
		System.out.println("Customer ID/ User ID : " + s);

	}

}

package com.wipro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class winhnd {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//*[text()='Apple iPhone 14 Plus (128 GB) - Midnight']")).click();
		Set<String> child = driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		for (String allwindow : child) {
			
			if (!allwindow.equals(parent)) {
				driver.switchTo().window(allwindow);
				
				driver.findElement(By.id("add-to-cart-button")).click();
		
		
			}
		}
	}
}

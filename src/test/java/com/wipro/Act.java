package com.wipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act {

	@Test
	private void tc() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(mobile).click().build().perform();
		
		WebElement  text = driver.findElement(By.xpath("//*[text()='Category']"));
		WebElement text1 = driver.findElement(By.id("twotabsearchtextbox"));
		acc.doubleClick(text).perform();
	    acc.dragAndDrop(text, text1).perform();
		/*
		 * WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		 * acc.sendKeys(text, "i found you").perform();
		 */
	}

}

package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();

		WebElement doubleClick = driver.findElement(By.xpath("//*[text()='Double Click Me']"));
		Actions a = new Actions(driver);
		a.doubleClick(doubleClick).perform();

		WebElement print = driver.findElement(By.xpath("//*[@id='doubleClickMessage']"));
		String p = print.getText();
		System.out.println(p);

		WebElement contextClick = driver.findElement(By.xpath("//*[text()='Right Click Me']"));
		Actions b = new Actions(driver);
		b.contextClick(contextClick).perform();

		WebElement print1 = driver.findElement(By.xpath("//*[@id='rightClickMessage']"));
		String s = print1.getText();
		System.out.println(s);

		Thread.sleep(2000);

	}

}

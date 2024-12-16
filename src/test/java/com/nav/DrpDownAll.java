package com.nav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDownAll {
	
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.out.println("Naveen Done the changes");
	System.out.println("Naveen Done the changes");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(option);
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	
	Thread.sleep(3000);

	
	WebElement dwn = driver.findElement(By.id("ide"));
	Select s = new Select(dwn);
	
	// To select multiple option in drpdown
	/*
	 * s.selectByVisibleText("Eclipse"); s.selectByVisibleText("IntelliJ IDEA");
	 * s.selectByVisibleText("Visual Studio"); s.selectByVisibleText("NetBeans");
	 */
	
	//s.deselectByVisibleText("Visual Studio");
	//s.deselectAll();
	
	//To select first option of duplicate and print
	/*
	 * WebElement firstOption = s.getFirstSelectedOption(); String text =
	 * firstOption.getText();
	 * System.out.println("First Selected Option is : "+text);
	 */
	
	List<WebElement> options = s.getOptions();
	String s1 = options.toString();
	
	for (WebElement w : options) {
		s.selectByVisibleText(w.getText());
	}
	System.out.println("Selected successfully");
}
}

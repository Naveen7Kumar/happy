package com.nav;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDwn {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(option);
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	
	Thread.sleep(3000);
	
	WebElement down = driver.findElement(By.id("course"));
	Select s = new Select(down);
	
	List<WebElement> opt = s.getOptions();
	
	for (WebElement w : opt) {
		
		String text = w.getText();
		System.out.println(text);
		
	}

}
}

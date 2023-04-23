package com.wipro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window is : "+parentWindow);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.xpath("//*[text()='Apple iPhone 13 (128GB) - Midnight']")).click();

		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("Child window is : "+childWindow);

		for (String allWindow : childWindow) {

			if (!allWindow.equals(parentWindow)) {

				driver.switchTo().window(allWindow);

				driver.findElement(By.id("add-to-cart-button")).click();
				System.out.println("Add to Cart page opened successfully");

			}

		}

	}

}

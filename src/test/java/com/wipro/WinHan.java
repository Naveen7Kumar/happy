package com.wipro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinHan {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String parentWindow = driver.getWindowHandle();
		System.out.println("I'm from Parent window ID : " + parentWindow);

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("I'm the Child window ID : " + allWindows);

		for (String windows : allWindows) {

			if (!windows.equals(parentWindow)) {

				driver.switchTo().window(windows);
				Thread.sleep(3000);
				WebElement n = driver.findElement(By.xpath("//*[@id = 'firstName']"));
				n.sendKeys("Naveen");
				String n1 = n.getAttribute("value");
				System.out.println("I'm from Child window : " + n1);

				driver.close();
			}

		}

		driver.switchTo().window(parentWindow);
		WebElement s = driver.findElement(By.id("name"));
		s.sendKeys("BYE TATA");
		String text = s.getAttribute("value");
		System.out.println("I'm back to parent window : " + text);
	}
}

package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);

		WebElement click = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		click.click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);

		Thread.sleep(2000);

		alert.accept();

		Thread.sleep(2000);

		WebElement confirm = driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]"));
		confirm.click();

		Thread.sleep(2000);

		WebElement cnfrm = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		cnfrm.click();

		Alert alert2 = driver.switchTo().alert();

		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.accept();

		Thread.sleep(2000);

		WebElement prompt = driver.findElement(By.xpath("(//*[@data-toggle='tab'])[3]"));
		prompt.click();

		WebElement prmpt = driver.findElement(By.xpath("//*[@class='btn btn-info']"));
		prmpt.click();

		Alert alert3 = driver.switchTo().alert();

		Thread.sleep(2000);

		alert3.sendKeys("Naveen");

		alert3.accept();
		
		WebElement print = driver.findElement(By.id("demo1"));
		String s = print.getText();
		System.out.println(s);

		driver.quit();

	}
}

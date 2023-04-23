package com.wipro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Picture {

	@Test
	private void t1() throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshot = t.getScreenshotAs(OutputType.FILE);
		File f = new File("F:\\Amazon\\Amazonscrnshot.jpeg");
		FileUtils.copyFile(screenshot, f);

	}

}

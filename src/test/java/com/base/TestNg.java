package com.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNg extends BaseClass {

	ExtentReports report;
	ExtentSparkReporter spark;

	@BeforeClass

	public void beforeClass() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter("C:\\Users\\www.abcom.in\\eclipse-workspace\\DemoMaven\\reports\\Amazon.html");
		report.attachReporter(spark);
		report.createTest("Execution started");
	}

	@Test
	public void tc1() {
		report.createTest("Browser Launch");
		browserLaunch("https://www.amazon.in/");
		System.out.println("Tc1");
	}
	
	@Test
	public void tc2() {
		ExtentTest createTest = report.createTest("URL validation");
		String url = driver.getCurrentUrl();
		if (url.equals("https://www.amazon.in/")) {
			createTest.pass("Url validation Successful");
			
		} else {
			createTest.fail("Url validation unsuccessful");

		}
		
	}

	private boolean url(String string) {
		return false;
	}

	@AfterClass
	public void afterClass() {
		ExtentTest test = report.createTest("Quit the browser");
		test.info("Take Screenshot");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
		
		report.flush();
		driver.quit();

	}

}

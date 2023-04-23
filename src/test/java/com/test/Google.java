package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Google extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome://newtab/");
		
		Thread.sleep(3000);
		
		WebElement f = driver.findElement(By.xpath("//*[@id=\"customizeIcon\"]"));
		f.click();
		
	}
	
}

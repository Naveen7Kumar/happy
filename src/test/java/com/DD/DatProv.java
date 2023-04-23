package com.DD;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class DatProv extends BaseClass{
	
	
		
		@Test(dataProvider = "logindata")
		public void sample(String username, String password) {

			browserLaunch("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			
			
			

		}
		
		
		@DataProvider(name = "logindata")
		public Object[][] login() {
			Object [][] data= new Object[2][2];
			
			data [0][0] = "Naveen";
			data [0][1] = "Kumar";
			data [1][0] = "Super";
			data [1][1] = "Star";
			return data;

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


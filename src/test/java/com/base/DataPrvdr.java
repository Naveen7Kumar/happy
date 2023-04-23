package com.base;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPrvdr extends BaseClass {
	
	@Test(dataProvider = "loginData")
	public void tc1(String user, String pass) {
		browserLaunch("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(pass);
	}
	
	@DataProvider(name="loginData")
	public Object[][] login() {
		Object[][] data = new Object[2][2];
		
		data[0][0]="Java";
		data[0][1]="12345";
		data[1][0]="oracle";
		data[1][1]="67890";
		return data;
		
	}

}

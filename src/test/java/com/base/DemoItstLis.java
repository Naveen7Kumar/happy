 package com.base;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ItestListner.class}) // (In class level)
public class DemoItstLis extends ItestListner{
	
	@Test
	public void tc1() {
		browserLaunch("https://www.facebook./");
		System.out.println("TC1");
	}
	
	@Test
	public void tc2() {
		browserLaunch("https://www.amazon.in/");
		
		System.out.println("TC2");
	}
	
	@Test                  //(timeOut =1000)         //(dependsOnMethods = "tc2")
	public void tc3() throws InterruptedException {
		browserLaunch("https://www.amazon.com/");
		System.out.println("TC3");
	}

}

package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void tc1() {
		System.out.println("TC1");
	}

	@Test  //(retryAnalyzer = com.test.RetryAnalyser.class) //-> for manual retry
	public void tc2() {
		Assert.assertTrue(false);
		System.out.println("TC2");
	}
	
	@Test
	public void tc3() {
		System.out.println("TC3");
	}

}

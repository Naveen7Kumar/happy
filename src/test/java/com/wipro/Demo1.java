package com.wipro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test (priority = 2)
	private void test1() {
		System.out.println("Test1");
	}

	@Test(priority = 1)
	private void test2() {
		System.out.println("Test2");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}

}

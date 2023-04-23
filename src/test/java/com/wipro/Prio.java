package com.wipro;

import org.testng.annotations.Test;

public class Prio {

	@Test(priority = 3)
	private void test1() {
		System.out.println("Test1");
	}

	@Test(enabled = false)
	private void test2() {
		System.out.println("Test2");
	}

	@Test(priority = 1)
	private void test3() {
		System.out.println("Test3");
	}

}

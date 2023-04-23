package com.wipro;

import org.testng.annotations.Test;

public class Demo2 {

	@Test(threadPoolSize = 2, invocationCount = 4)
	private void tc1() {
		System.out.println("tc1 -" + Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		System.out.println("tc2 -" + Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		System.out.println("tc3 -" + Thread.currentThread().getId());
	}

	@Test
	private void tc4() {
		System.out.println("tc4 -" + Thread.currentThread().getId());
	}

}

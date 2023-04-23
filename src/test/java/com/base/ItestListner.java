package com.base;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListner extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
		try {
			screenshot(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test Failed with Timeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}

}

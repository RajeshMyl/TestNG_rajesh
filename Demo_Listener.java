package com.demo_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo_Listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("before test start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("when test got succeed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("when test got failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("when got skiped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("when test got failed 'but its okay'");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("before everything");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	System.out.println("after everything");	
	}

}

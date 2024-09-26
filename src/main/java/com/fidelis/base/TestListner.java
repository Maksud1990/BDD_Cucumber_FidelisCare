package com.fidelis.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.fidelis.utils.Utility;




public class TestListner {

public class TestListener implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started " + result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successfully Finished " + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed " + result.getName());
		WebDriver dr=Base.hm.get("driver");
		
		Utility.takeScreenshot(dr, result.getName());
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped " + result.getName());
	}
}
}

package com.advSelenium.extentReport;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class UtilityObjectThread {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal();
	public static ThreadLocal<ExtentTest> test = new ThreadLocal();
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	public static void setDriver(WebDriver d)
	{
		driver.set(d);
	}
	public static ExtentTest getTest()
	{
		return test.get();
	}
	public static void setTest(ExtentTest t)
	{
		test.set(t);
	}
}

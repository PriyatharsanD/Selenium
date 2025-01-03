package com.advSelenium.extentReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImpl implements ISuiteListener, ITestListener {
	
	public static ExtentReports reports;
	public static ExtentTest test; 
	public void onStart(ISuite suite)
	{
		String name = suite.getName();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./advancedReport/"+name+".html");
		sparkReporter.config().setDocumentTitle("Screenshot Sample");
		sparkReporter.config().setReportName("Amazon Screenshots");
		sparkReporter.config().setTheme(Theme.DARK);
		reports=new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("OS","Windows");
		reports.setSystemInfo("Browser","Chrome");
	}
	public void onFinish(ISuite suite)
	{
		reports.flush();
	}
	public void onTestStart(ITestResult result) 
	{
			test=reports.createTest(result.getMethod().getMethodName());
			UtilityObjectThread.setTest(test);
			test.log(Status.INFO,"Started");
	}
	public void onTestSuccess(ITestResult result) 
	{
		 test.log(Status.INFO, "Completed");
	}
	 
	public void onTestFailure(ITestResult result) 
	{
		String fname = result.getMethod().getMethodName();
		TakesScreenshot shot=(TakesScreenshot)UtilityObjectThread.getDriver();
		String ss = shot.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(ss,fname+"Error");
	}
	
}

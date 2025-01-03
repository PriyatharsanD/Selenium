package com.advSelenium.extentReport;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Sample1 {
	//Add Extend Report dependency
	@Test
	public void test1()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./advancedReport/report.html");
		spark.config().setDocumentTitle("Sample Test");
		spark.config().setReportName("Sample1");
		spark.config().setTheme(Theme.DARK);
		
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("OS","Windows 10");
		reports.setSystemInfo("Browser","Chrome");
		//--Set test method name
		ExtentTest test = reports.createTest("test1");
		test.log(Status.INFO,"Browser is Launched");
		Assert.assertTrue(true);
		test.log(Status.INFO,"Application is Opened");
		test.log(Status.PASS,"Verification is success");
		test.log(Status.WARNING,"One Warning");
		reports.flush();
		
	}

}

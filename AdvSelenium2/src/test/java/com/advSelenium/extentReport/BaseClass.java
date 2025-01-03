package com.advSelenium.extentReport;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	public ExtentReports reports;
	@BeforeSuite
	public void configReport()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./advancedReport/AmazonReport.html");
		spark.config().setDocumentTitle("Amazon");
		spark.config().setReportName("Amazon-Home_Page");
		spark.config().setTheme(Theme.STANDARD);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("Envi","Testing");
		reports.setSystemInfo("OS","Windows_10");
		reports.setSystemInfo("Browser","Chrome");
	}
	@AfterSuite
	public void close()
	{
		reports.flush();
	}

}

package com.advSelenium.prameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LaunhBrowserTest {
	public ExtentSparkReporter sparkReporter; 
	@BeforeSuite
	public void configReport()
	{
		sparkReporter = new ExtentSparkReporter("./extentReport/parameterReport.html");
		sparkReporter.config().setDocumentTitle("Parameter");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Parameter Test Result");
	}
	@Test
	public void launch()
	{
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("OS","Windows-10");
		reports.setSystemInfo("Envi","Testing");
		reports.setSystemInfo("Browser","Chrome");
		ExtentTest test = reports.createTest("Launch");
		WebDriver driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
		test.log(Status.PASS,"Amazon is launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(System.getProperty("product"));
		test.log(Status.INFO,"Product is entered");
		search.submit();
		test.log(Status.PASS,"Product is displayed");
		reports.flush();
		
	}

}

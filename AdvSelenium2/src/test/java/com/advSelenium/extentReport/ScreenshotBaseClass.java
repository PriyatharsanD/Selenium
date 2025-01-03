package com.advSelenium.extentReport;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ScreenshotBaseClass {
	public WebDriver driver;
	@BeforeClass
	public void launch()
	{
		driver = new ChromeDriver();
		UtilityObjectThread.setDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}

}

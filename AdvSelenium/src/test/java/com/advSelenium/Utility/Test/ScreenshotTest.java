package com.advSelenium.Utility.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.genericUtility.FileUtility;
import com.google.genericUtility.webDriverUtility.WebDriverUility;

public class ScreenshotTest {
	@Test
	public void screenShot() throws Exception
	{
		FileUtility f = new FileUtility();
		WebDriverUility driverUility = new WebDriverUility();
		String browser = f.getDataFromPropertyFile("browser");
		WebDriver driver = new ChromeDriver();
		driver.get(f.getDataFromPropertyFile("url"));
		driverUility.maximizeWindow(driver);
		driverUility.waitForPageToLoad(driver);
		driverUility.screenshotOnDriver(driver);
		driverUility.close(driver);
		
	}

}

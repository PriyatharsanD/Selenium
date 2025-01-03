package com.advSelenium.DataDrivenTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromCMD {
	@Test
	public void sampleTest()
	{
		WebDriver driver=null;
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
	}

}

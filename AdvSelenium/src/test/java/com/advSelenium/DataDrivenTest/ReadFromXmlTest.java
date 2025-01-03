package com.advSelenium.DataDrivenTest;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadFromXmlTest {
	@Test
	public void  test(XmlTest test)
	{
		WebDriver driver=null;
		String browser = test.getParameter("browser");
		String url = test.getParameter("url");
		if(browser.equalsIgnoreCase("chrome"))
			 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
	}

}

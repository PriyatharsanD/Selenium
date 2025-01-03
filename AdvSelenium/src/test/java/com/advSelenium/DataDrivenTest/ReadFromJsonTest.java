package com.advSelenium.DataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadFromJsonTest {
	
	//Add JSON simple dependency
	@Test
	public void sampleTest() throws FileNotFoundException, IOException, ParseException
	{
		WebDriver driver=null;
		JSONParser parser = new JSONParser();
		Object obj=parser.parse(new FileReader("./DataSource/CommonData.json"));
		JSONObject json = (JSONObject)obj;
		String browser = json.get("browser").toString();
		String url = json.get("url").toString();
		if(browser.equalsIgnoreCase("chrome"))
			 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
		
	}

}

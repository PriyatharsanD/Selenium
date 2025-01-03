package com.advSelenium.DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromProperty {
	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		Scanner s = new Scanner(System.in);	
		String browser = s.nextLine();
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./SampleData/commonData.properties");
		Properties properties = new Properties();
		properties.load(fis);
		driver.get(properties.getProperty("url"));
		driver.close();
	}

}

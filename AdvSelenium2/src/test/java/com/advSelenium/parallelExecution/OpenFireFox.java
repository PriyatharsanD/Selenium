package com.advSelenium.parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.drive","C:\\Users\\Priyadrashan\\Downloads\\geckodriver-v0.35.0-win32\\geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
	}

}

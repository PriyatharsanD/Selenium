package com.webShopTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.genericUtility.FileUtility;
import com.google.genericUtility.webDriverUtility.WebDriverUility;

public class StaleElemExcepTest {
	@Test
	public void StaleTest() throws Exception {
		FileUtility fileUtility = new FileUtility();
		WebDriverUility driverUtility = new WebDriverUility();
		WebDriver driver = new ChromeDriver();
		driver.get(fileUtility.getDataFromPropertyFile("url"));
		driverUtility.maximizeWindow(driver);
		driverUtility.waitForPageToLoad(driver);
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		
		email.sendKeys("priya@gmail.com");
		driver.navigate().refresh();
		password.sendKeys("priya123");
		login.click();
		driverUtility.close(driver);
	}

}

package com.advSelenium.utility.webdrivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 * 
 * @author Priyadrashan
 * contains driver utilities
 */

public class DriverUtility {
	/**
	 * maximizes the window but acception web driver as argument
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitTillPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void launchBrowser(WebDriver driver, String url)
	{
		driver.get(url);
	}
	public void hover(WebDriver driver,WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	/**
	 * closes the window by accepting web driver as an argument
	 * @param driver
	 */
	public void close(WebDriver driver)
	{
		driver.close();
	}
}

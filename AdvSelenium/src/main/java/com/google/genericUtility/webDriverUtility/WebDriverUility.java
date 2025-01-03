package com.google.genericUtility.webDriverUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUility {
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void waitForElementVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void switchToWindowByTitle(WebDriver driver, String expTitle)
	{
		Set<String> windows = driver.getWindowHandles();
		for(String window: windows)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().equals(expTitle))
				return;
		}
	}
	public void select(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void select(WebElement element, String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver, String name)
	{
		driver.switchTo().frame(name);
	}
	public void SwitchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void switchToAlertAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void HoverOnElement(WebDriver driver,WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();;
	}
	public void screenshotOnDriver(WebDriver driver) throws IOException
	{
		TakesScreenshot ss = (TakesScreenshot)driver;
		File image = ss.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshots/driver.png");
		FileHandler.copy(image, target);
	}
	public void screenshotOnElement(WebElement element) throws IOException
	{
		String name=element.getText();
		File image=element.getScreenshotAs(OutputType.FILE);
		File target=new File("/screenshots/"+name+".png");
		FileHandler.copy(image, target);
	}
	public void close(WebDriver driver) {
		driver.close();
	}

}

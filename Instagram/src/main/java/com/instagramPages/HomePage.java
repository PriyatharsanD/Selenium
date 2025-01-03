package com.instagramPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//head/title[text()='Instagram']")
	public WebElement title;
	
	public String getTitle()
	{
		System.out.println("Hello");
		return title.getText();
	}
}
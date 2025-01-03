package com.instagramPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class LogInConfirmationPage {
	public LogInConfirmationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='verificationCode']")
	WebElement securityCodeField;
	
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement confirmButton;
	
	public void setSecurityCode(String code)
	{
		securityCodeField.sendKeys(code);
	}
	public void clickConfirmButton()
	{
		confirmButton.click();
	}
	public WebElement getConfirmButton()
	{
		return confirmButton;
	}
	
	

}

package com.instagram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.instagramPages.HomePage;
import com.instagramPages.LogInConfirmationPage;
import com.instagramPages.LogInPage;

public class LoginTest {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.instagram.com/");
		
		LogInPage loginPage = new LogInPage(driver);
		loginPage.setUsername("priyatharsan_d");
		loginPage.setPassword("Devadoss@09990");
		loginPage.clickLogIn();
		
		LogInConfirmationPage confirm = new LogInConfirmationPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(confirm.getConfirmButton()));
		System.out.println("Clicked");
		HomePage homePage = new HomePage(driver);
		if(homePage.getTitle().equals("Instagram"))
		{
			driver.close();
		}
		
	}

}

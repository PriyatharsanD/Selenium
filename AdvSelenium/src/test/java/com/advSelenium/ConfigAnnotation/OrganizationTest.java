package com.advSelenium.ConfigAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrganizationTest extends BaseClass{
	@Test
	public void organization()
	{
		System.out.println("create organization");
	}
	@Test
	public void induxtry()
	{
		System.out.println("create industry");
	}
}

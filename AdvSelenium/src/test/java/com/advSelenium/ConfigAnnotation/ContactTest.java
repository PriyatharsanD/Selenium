package com.advSelenium.ConfigAnnotation;

import org.testng.annotations.Test;

public class ContactTest extends BaseClass {
	@Test
	public void createContact()
	{
		System.out.println("create contact");
	}
	@Test
	public void createContactWithDateTest()
	{
		System.out.println("create contact with date");
	}

}

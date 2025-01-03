package com.advSelenium.Assertion;

import java.util.TreeMap;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	@Test
	public void test1()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Step-1");
		softAssert.assertTrue(false);
		System.out.println("Step-2");
		softAssert.assertFalse(false);
		System.out.println("Step-3");
		softAssert.assertEquals("Hello", "Hi");
		System.out.println("End");
		softAssert.assertAll();
	}
	@Test
	public void test2()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Step-1");
		softAssert.assertTrue(false);
		System.out.println("Step-2");
		softAssert.assertFalse(false);
		System.out.println("Step-3");
		softAssert.assertEquals("Hello", "Hi");
		System.out.println("End");
		softAssert.assertAll();
	}
}
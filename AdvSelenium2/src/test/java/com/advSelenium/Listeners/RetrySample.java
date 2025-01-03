package com.advSelenium.Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetrySample {
	@Test(retryAnalyzer = com.advSelenium.Listeners.RetryListenerImp.class)
	public void test1()
	{
		Assert.assertTrue(false);
	}
}
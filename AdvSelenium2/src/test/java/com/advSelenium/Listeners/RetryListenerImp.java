package com.advSelenium.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerImp implements IRetryAnalyzer{

	int start=1,end=5;
	public boolean retry(ITestResult result) {
		if(start<=5)
		{
			start++;
			return true;
		}
		return false;
	}
	

}

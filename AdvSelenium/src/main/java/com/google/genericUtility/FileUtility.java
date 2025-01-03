package com.google.genericUtility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertyFile(String key) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium\\src\\main\\resources\\CommonData\\AppConfigData.properties");
		Properties properties = new Properties();
		properties.load(fis);
		return (String)properties.get(key);
	}
}

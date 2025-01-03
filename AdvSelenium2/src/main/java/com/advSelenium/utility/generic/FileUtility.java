package com.advSelenium.utility.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Indiqube\\selenium\\AdvSelenium2\\src\\main\\resources\\DataSource\\CommonData\\CommonData.properties");
		Properties properties = new Properties();
		properties.load(fis);
		return properties.getProperty(key);
	}
}

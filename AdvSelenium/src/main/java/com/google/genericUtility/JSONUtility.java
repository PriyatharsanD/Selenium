package com.google.genericUtility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONUtility {
	public Object getDataFromJSONFile(String key) throws Exception
	{
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("D:\\\\Indiqube\\\\selenium\\\\AdvancedSelenium\\\\src\\\\main\\\\resources\\\\CommonData\\\\AppConfigData.json"));
		JSONObject json = (JSONObject)obj;
		return json.get(key);
	}
	public static void main(String[] args) throws Exception {
		JSONUtility jsonUtility = new JSONUtility();
		System.out.println(jsonUtility.getDataFromJSONFile("url"));
	}

}

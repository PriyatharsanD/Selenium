package com.advSelenium.Listeners;

import java.util.Date;

public class TimeStamp {
	public static String getTimeStamp()
	{
		Date date = new Date();
		return date.toString().replace(":","_").replace(" ","_");
	}

}

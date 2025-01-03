package com.google.genericUtility.webDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public String getCurrentDate()
	{
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.format(date);
		return dateFormat.toString();
	}
	public String getDateAfterDays(int days)
	{
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.format(date);
		Calendar c = dateFormat.getCalendar();
		c.add(Calendar.DAY_OF_MONTH,days);
		return dateFormat.format(c.getTime());
	}
	
	public int getRandomNumbers(int upperlimit)
	{
		Random r = new Random();
		return r.nextInt(upperlimit);
	}

}

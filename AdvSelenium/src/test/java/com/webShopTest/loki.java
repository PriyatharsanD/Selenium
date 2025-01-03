package com.webShopTest;

import java.util.NoSuchElementException;

public class loki {
	
	public static void main(String[] args)
	{
		try
		{
			throw new NoSuchElementException("element not exist");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

}

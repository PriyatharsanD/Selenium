package com.google.genericUtility;


public class GenerateAlphaNumRandomNumber {
	public static void main(String[] args) {
		int limit=5;
		String s = "0123456789abcdefABCDEF";
		StringBuffer num=new StringBuffer();
		for(int i=1;i<=limit;i++)
		{
			int index=(int) (s.length()*Math.random());
			num.append(s.charAt(index));
		}
		System.out.println(num);
	}
}

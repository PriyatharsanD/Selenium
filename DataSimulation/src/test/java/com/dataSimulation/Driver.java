package com.dataSimulation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Driver {
	public static void main(String[] args) {
		
		ExcelUtility excelUtility = new ExcelUtility(args[0]);
		for(int i=1;i<excelUtility.getRowCount("Sheet1");i++)
		{
			String name=excelUtility.getDataFromExcel("Sheet1",i,0);
			String designation=excelUtility.getDataFromExcel("Sheet1",i,1);
			
			String body="{\r\n"
					+ "    \"name\":"+name+",\r\n"
					+ "    \"designation\":"+designation+"\r\n"
					+ "}";
			RestAssured.given()
				.contentType(ContentType.JSON)
				.body(body)
				.log().all()
			.when()
				.post("https://reqres.in/api/users");
			
		}
		
	}

}

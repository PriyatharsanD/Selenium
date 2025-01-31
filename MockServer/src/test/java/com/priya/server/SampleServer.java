package com.priya.server;

import spark.Spark;

public class SampleServer {

	public static void main(String[] args) {
		Spark.port(8282);
		Spark.post("/hitPost", (req,res)->{
			res.status(200);
			res.type("application/json");
			return "{\"status\":\"ok\"}";
		});
		System.out.println("------Running-------");
	}
	

}

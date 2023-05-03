package TestCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
	Response resp;
	
	@BeforeTest
	public void setUp()
	{
		//Send Request
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		
		//Create the Data
		
		JSONObject json=new JSONObject();
		json.put("name", "Lakshmi");
		json.put("author", "Learn API");
		request.body(json.toString());
		resp=request.post("https://reqres.in/api/users");
	}
	@Test
	public void test()
	{
		String data=resp.toString();
		System.out.println("Response in JSON format" +data);
		int code = resp.getStatusCode();
		System.out.println("Status Code is "+code);
		String line = resp.getStatusLine();
		System.out.println("Status Line is"+line);
		Assert.assertEquals(code, 201);
	
	
	
	}

}

package TestCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	@Test
	public void test()
	{
		//Send Request
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type","application/json");
	
	//Create Data
	JSONObject json=new JSONObject();
	json.put("id", "17");
	json.put("title", "selenium");
	json.put("author", "API Testing");
	
	//Convert data into String
	request.body(json.toJSONString());
	
	Response resp = request.put("http://localhost:3000/posts/17");
	
	int code = resp.getStatusCode();
	
	System.out.println("Response code"+ code);
	
	Assert.assertEquals(code, 200);
	
	
	String status = resp.getStatusLine();
	
	System.out.println("Status Line is "+ status);
	
	}

}

package TestCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
	
	@Test
	public void test()
	{
		
	RequestSpecification request = RestAssured.given();
	
	Response resp = request.delete("http://localhost:3000/posts/21");
	
	int code = resp.getStatusCode();
	
	Assert.assertEquals(code, 404);
	
	String status = resp.getStatusLine();
	
	System.out.println("Status Line is "+ status);
	
	}

}

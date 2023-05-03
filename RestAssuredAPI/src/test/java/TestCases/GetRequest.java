package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	public void testResponseCode()
	{
		//Get:This method to retrieve the data from server no changes to server or resource
		//Request URL
	Response resp=get("https://reqres.in/api/users/2");
	
	int code = resp.getStatusCode();
	
	System.out.println("Status Code is " +code);
	
	Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testBody()
	{
		//Request URL
	Response resp=get("https://reqres.in/api/users/2");
	
	String data = resp.asString();
	
	System.out.println("Data is " +data);
	
	System.out.println("Response Time is "+ resp.getTime());
	}


}

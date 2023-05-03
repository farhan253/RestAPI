package TestCases;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetRequest1 {
	
	Response resp;
	
	@BeforeTest
	public void setUp()
	{
		Response resp=get("https://reqres.in/api/users/2");
	}
	@Test
	public void testResponseCode()
	{
//		//Request URL
//
//	Response resp=get("https://reqres.in/api/users/2");
		
	int code = resp.getStatusCode();
	
	System.out.println("Status Code is " +code);
	
	Assert.assertEquals(code, 200);
	
	String status = resp.getStatusLine();
	
	System.out.println("Status Line is "+ status);
	}
	

}

package Org.Testing.TestSteps;

import java.util.Properties;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods (Properties pr)
	{
		this.pr=pr;
	}
	
	public Response PostRequest(String body, String URI)
	{
		Response res =
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.post(pr.getProperty(URI));
		return res;		
	}
	
	public Response GetAllRequest(String URI)
	{
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(URI));
		return res;	
	}
	
	public Response GetSpecRequest(String URI, String idvalue)
	{
		String CompleteURI = pr.getProperty(URI)+"/"+idvalue;
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(CompleteURI);
		return res;	
	}
	
	public Response PutRequest(String body, String URI, String keyvalue)
	{
		String CompleteURI = pr.getProperty(URI)+"/"+keyvalue;
		Response res =
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(CompleteURI);
		return res;		
	}
	
	public Response DeleteSpecRequest(String URI, String idvalue)
	{
		String CompleteURI = pr.getProperty(URI)+"/"+idvalue;
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(CompleteURI);
		return res;	
	}
	
	
}

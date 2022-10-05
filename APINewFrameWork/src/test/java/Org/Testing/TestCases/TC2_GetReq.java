package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.ParseJsonHandler;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC2_GetReq 
{

	public void ExecuteTC2() throws IOException 
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
		HTTPMethods Obj = new HTTPMethods(Prop);
		
		Response res = Obj.GetAllRequest("QA_URI_JavaBatchAPI");
		ParseJsonHandler.JsonDataParsing(res.asString(),"id");
		
		System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		System.out.println("**************TC2*****************");
	}
}

package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC3_GetSpecificReq
{
	public void ExecuteTC3() throws IOException
	
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
	
	    HTTPMethods Obj = new HTTPMethods(Prop);
	    
	   Response res =  Obj.GetSpecRequest("QA_URI_JavaBatchAPI", TC1_PostReq.returnIdValue);
	   
	   System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		System.out.println("**************TC3*****************");
	    
	    
	}
}

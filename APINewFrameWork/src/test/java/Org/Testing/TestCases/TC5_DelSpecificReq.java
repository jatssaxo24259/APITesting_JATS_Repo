package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC5_DelSpecificReq 
{
	public void Execute_TC5() throws IOException
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
	    HTTPMethods Obj = new HTTPMethods(Prop);
	    
	   Response res =  Obj.DeleteSpecRequest("QA_URI_JavaBatchAPI", TC1_PostReq.returnIdValue);
	   
	   System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		System.out.println("**************TC5*****************");
	    
	}

}

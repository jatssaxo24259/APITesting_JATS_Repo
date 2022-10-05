package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC10_GetSpecificPassengerDetail 
{
	public void ExecuteTC10() throws IOException
	{
		{
			Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
		    HTTPMethods Obj = new HTTPMethods(Prop);
		    
		   Response res =  Obj.GetSpecRequest("QA_Airline_Passenger", TC9_PassengerPostReq.passengerreturnIdValue);
		   
		   System.out.println("Response Status Code is");
			System.out.println(res.getStatusCode());
			System.out.println(res.asString());
			System.out.println("**************TC10*****************");
		    
		    
		}
	}

}

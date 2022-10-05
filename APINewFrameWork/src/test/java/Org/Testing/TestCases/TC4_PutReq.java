package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.JsonFileHandler;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC4_PutReq 
{
	public void ExecuteTC4() throws IOException
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
		String BodyData = JsonFileHandler.GetBodyData("../APINewFrameWork/src/test/java/Org/Testing/Resources/UpdateJsonFile.json");
		
		HTTPMethods Obj = new HTTPMethods(Prop);
		
		Response res = Obj.PutRequest(BodyData, "QA_URI_JavaBatchAPI", TC1_PostReq.returnIdValue);
		
		System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println("Return Id from TC1 response is "+ TC1_PostReq.returnIdValue);
		System.out.println("**********************TC4******************");
	}
}

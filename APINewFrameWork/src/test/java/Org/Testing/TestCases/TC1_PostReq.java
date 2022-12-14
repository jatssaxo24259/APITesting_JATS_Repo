package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.JSONFieldUpdateHelper;
import Org.Testing.Utilities.JsonFileHandler;
import Org.Testing.Utilities.ParseJsonHandler;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC1_PostReq 
{
	public static String returnIdValue;
	@Test
	public void ExecuteTC1() throws IOException
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
		String BodyData = JsonFileHandler.GetBodyData("../APINewFrameWork/src/test/java/Org/Testing/Resources/VariableJsonInput.json");
		Random r = new Random();
		int ran = r.nextInt();
		String input = Integer.toString(ran);		
		BodyData = JSONFieldUpdateHelper.FieldUpdate(BodyData, "id",input);
		
		HTTPMethods Obj = new HTTPMethods(Prop);
		
		Response res = Obj.PostRequest(BodyData, "QA_URI_JavaBatchAPI");
		
		returnIdValue= ParseJsonHandler.ParseJson(res.asString(),"id");
		
		System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println("Return Id from response is "+ returnIdValue);
		System.out.println("**********************TC1******************");
	}
}

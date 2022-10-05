package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.JSONFieldUpdateHelper;
import Org.Testing.Utilities.JsonFileHandler;
import Org.Testing.Utilities.ParseJsonHandler;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC9_PassengerPostReq
{
	public static String passengerreturnIdValue;
	public void ExecuteTC9() throws IOException
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
		String BodyData = JsonFileHandler.GetBodyData("../APINewFrameWork/src/test/java/Org/Testing/Resources/PassengerInputData.json");
		//System.out.println("Please enter Id number");
		//Scanner s = new Scanner(System.in);
		//String input = s.next();			
		BodyData = JSONFieldUpdateHelper.FieldUpdate(BodyData, "id",TC6_AirlinePostReq.returnAirlineIdValue);
			
		HTTPMethods Obj = new HTTPMethods(Prop);
		
		Response res = Obj.PostRequest(BodyData, "QA_Airline_Passenger");
		
		passengerreturnIdValue= ParseJsonHandler.ParseJson(res.asString(),"_id");
		
		System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		System.out.println("Return Id from response is "+ passengerreturnIdValue);
		System.out.println("**********************TC9******************");
	
	}
}

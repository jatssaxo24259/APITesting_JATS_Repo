package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestSteps.HTTPMethods;
import Org.Testing.Utilities.JSONFieldUpdateHelper;
import Org.Testing.Utilities.JsonFileHandler;
import Org.Testing.Utilities.PropertiesHandler;
import io.restassured.response.Response;

public class TC11_PassengerPutReq
{
	public void ExecuteT11() throws IOException
	{
		Properties Prop = PropertiesHandler.GetProperties("../APINewFrameWork/URIs.properties");
		
		String BodyData = JsonFileHandler.GetBodyData("../APINewFrameWork/src/test/java/Org/Testing/Resources/PassengerFullUpdate.json");
		
		BodyData = JSONFieldUpdateHelper.FieldUpdate(BodyData, "id",TC6_AirlinePostReq.returnAirlineIdValue);
		System.out.println(BodyData);
		HTTPMethods Obj = new HTTPMethods(Prop);
		
		Response res = Obj.PutRequest(BodyData, "QA_Airline_Passenger", TC9_PassengerPostReq.passengerreturnIdValue);
		
		System.out.println("Response Status Code is");
		System.out.println(res.getStatusCode());
		System.out.println("Return Id from TC9 response is "+ TC9_PassengerPostReq.passengerreturnIdValue);
		System.out.println("**********************TC11******************");
	}

}

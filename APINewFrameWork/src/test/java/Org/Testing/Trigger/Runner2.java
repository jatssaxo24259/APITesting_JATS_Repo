package Org.Testing.Trigger;

import java.io.IOException;

import Org.Testing.TestCases.TC9_PassengerPostReq;
import Org.Testing.TestCases.TC10_GetSpecificPassengerDetail;
import Org.Testing.TestCases.TC11_PassengerPutReq;
import Org.Testing.TestCases.TC6_AirlinePostReq;
import Org.Testing.TestCases.TC8_GetSpecificAirlineReq;



public class Runner2 
{
	public static void main(String[] args) throws IOException
	{
		TC6_AirlinePostReq obj1 = new TC6_AirlinePostReq();
		obj1.ExecuteTC6();
		
		TC8_GetSpecificAirlineReq obj2 = new TC8_GetSpecificAirlineReq();
		obj2.ExecuteTC8();
		
		TC9_PassengerPostReq obj3 = new TC9_PassengerPostReq();
		obj3.ExecuteTC9();
		
		TC10_GetSpecificPassengerDetail obj4=new TC10_GetSpecificPassengerDetail();
		obj4.ExecuteTC10();
		
		TC11_PassengerPutReq obj5 = new TC11_PassengerPutReq();
		obj5.ExecuteT11();
	}
}

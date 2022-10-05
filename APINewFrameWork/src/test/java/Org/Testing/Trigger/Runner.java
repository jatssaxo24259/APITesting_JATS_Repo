package Org.Testing.Trigger;

import java.io.IOException;

import Org.Testing.TestCases.TC1_PostReq;
import Org.Testing.TestCases.TC2_GetReq;
import Org.Testing.TestCases.TC3_GetSpecificReq;
import Org.Testing.TestCases.TC4_PutReq;
import Org.Testing.TestCases.TC5_DelSpecificReq;

public class Runner 
{
	public static void main(String[] args) throws IOException 
	{
		TC1_PostReq obj1 = new TC1_PostReq();
		obj1.ExecuteTC1();
		
		TC2_GetReq obj2 = new TC2_GetReq();
		
		obj2.ExecuteTC2();
		
		TC3_GetSpecificReq obj3 = new TC3_GetSpecificReq();
		
		obj3.ExecuteTC3();
		
		TC4_PutReq obj4 = new TC4_PutReq();
		obj4.ExecuteTC4();
		
		TC5_DelSpecificReq obj5 = new TC5_DelSpecificReq();
		obj5.Execute_TC5();
		
	}
}

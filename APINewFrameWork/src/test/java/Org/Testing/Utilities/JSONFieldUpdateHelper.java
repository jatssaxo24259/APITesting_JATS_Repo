package Org.Testing.Utilities;

import java.util.regex.Pattern;

public class JSONFieldUpdateHelper 
{

	public static String FieldUpdate(String bodydata, String keyname, String keyvalue)
	{
		String Data = bodydata.replaceAll(Pattern.quote("{{"+keyname+"}}"), keyvalue);
		
		return Data;
	}
}

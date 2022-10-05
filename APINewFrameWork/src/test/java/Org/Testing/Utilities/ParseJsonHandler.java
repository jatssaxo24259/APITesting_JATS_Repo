package Org.Testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonHandler 
{

	public static void JsonDataParsing(String responsedata, String keyname)
	{
		JSONArray arr = new JSONArray(responsedata);
		for (int j = 0; j < arr.length(); j++) 
		{
			JSONObject ob = arr.getJSONObject(j);
			System.out.println(ob.get(keyname));
		}
	}
	
	public static void JsonDataParsingAirline(String responsedata, String keyname)
	{
		JSONArray arr = new JSONArray(responsedata);
		for (int j = 0; j < arr.length(); j++) 
		{
			JSONObject ob = arr.getJSONObject(j);
			System.out.println(ob.getInt(keyname));
		}
	}
	
	public static String ParseJson(String responsedata, String keyname)
	{
		JSONObject js = new JSONObject(responsedata);
		return js.getString(keyname);
	}
	
	public static String IntParseJson(String responsedata, String keyname)
	{
		JSONObject js = new JSONObject(responsedata);
		return Integer.toString(js.getInt(keyname));
	}
}

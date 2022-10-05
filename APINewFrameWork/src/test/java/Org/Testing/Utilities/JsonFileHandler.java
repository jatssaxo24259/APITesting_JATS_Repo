package Org.Testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileHandler 
{
	public static String GetBodyData(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		JSONTokener tkn = new JSONTokener(fr);
		JSONObject bodydata = new JSONObject(tkn);
		
		return bodydata.toString();
	}
}

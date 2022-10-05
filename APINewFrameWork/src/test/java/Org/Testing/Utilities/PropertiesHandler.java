package Org.Testing.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler
{		
	public static Properties GetProperties(String filepath) throws IOException
	{
		File f = new File(filepath);
		FileReader Fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(Fr);
		
		return pr;
		
	}
	

}

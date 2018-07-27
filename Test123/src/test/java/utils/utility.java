package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class utility {
	
	public static String PropertyFilegetter(String Filename,String Value) throws IOException
	{
		 
		 FileReader reader=new FileReader(Filename);  
	      
		    Properties p=new Properties();  
		    p.load(reader);  		      
		   
		     return p.getProperty(Value);
		    
		
		
	}
	
	public static void PropertyFilesetter(String Filename,String Value) throws IOException
	{
		 
		 FileReader reader=new FileReader(Filename);  
	      
		    Properties p=new Properties();  
		    p.load(reader);  		      
		   
		      p.setProperty(Value,"data");
		    
		
		
	}
	
	
	
	static void YamlParser()
	{
		
	}
	
	
	
	

}

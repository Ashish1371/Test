package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import utility.SeleniumBrowser;
//import utility.utility;
import utils.*;
//import utility.utility*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.junit.Test;

public class def {

	
	static SeleniumBrowser browser;
	 static String url=null;
	 static String Filename=null;
	 static String Browser=null;
	 long waittime;
 
@Before
 public void Startup() throws IOException
 {
	 System.out.println("hello");
	 Filename = "src/test/java/config/browser.cfg";
	 Browser=utility.PropertyFilegetter(Filename, "browser");
	  browser = new SeleniumBrowser(Browser);  
	  url=utility.PropertyFilegetter(Filename, "url");	
	  waittime= Long.parseLong(utility.PropertyFilegetter(Filename, "Timeout"));
		 
	  
	  
		
 }	



@When("^User Open FireFox Driver$")
public void User_Open_FireFox_Driver() throws Throwable {
	
	
   
}



@When("^User Opens facebook$")
public void user_Opens_facebook() throws Throwable {
	browser.openUrl(url);
	
   
}

@When("^User fills sign up form$")
public void user_fills_sign_up_form(DataTable dt) throws Throwable {
    
	List<Map<String, String>> list = dt.asMaps(String.class, String.class);
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).get("Type"));
		System.out.println(list.get(i).get("Field"));
		System.out.println(list.get(i).get("Value"));
		String abc=utility.PropertyFilegetter(Filename,list.get(i).get("Field"));
		System.out.println(abc);
		
		browser.FindLocator(list.get(i).get("Type"),abc,list.get(i).get("Value"),waittime);
		
		
		
		
		
		
		
	}
}



	
}

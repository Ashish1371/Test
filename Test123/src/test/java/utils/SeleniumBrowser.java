package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBrowser {
	 WebDriver driver;

	@SuppressWarnings("deprecation")
	public SeleniumBrowser(String Browser)
	{
		
		if 	(Browser.equalsIgnoreCase("firefox"))
		{
		driver= new FirefoxDriver();
			
			
		}
		
		else if (Browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if (Browser.equalsIgnoreCase("internetexplorer"))
		{
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true); 
			driver = new InternetExplorerDriver(ieCapabilities);
			
			
			
		}
		
		else {  
	        System.out.println("Invalid Browser");
	        System.exit(0);
	    }  
		
		
	}
	
	
	
	
	void handleCertificate(String Browser)
	{
		
	}
	
	
	public void openUrl(String URL)
	{
		
		driver.get(URL);
	}
	
	
	public void FindLocator(String type,String fieldName,String Value,long waittime)
	{
		if(type.equalsIgnoreCase("button"))
		{
			
			
			ExplictWait(fieldName.split(":")[1],fieldName.split(":")[0],waittime);	
			System.out.println("clicking button");
			Click(fieldName.split(":")[1],fieldName.split(":")[0]);
				
			
		}
			
			else if(!type.equalsIgnoreCase("button"))
				
			{
				
				System.out.println("--------------"+type);
				ExplictWait(fieldName.split(":")[1],fieldName.split(":")[0],waittime);
				fillInput(fieldName.split(":")[1],fieldName.split(":")[0],type,Value);
				
				
			}
		
			
			
		}
		
	
	
	
	
	void Click(String locator,String locatortype)
	{
		
		if(locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(locator)).click();
			
		}
		
		else if(locatortype.equalsIgnoreCase("css"))
		{
			driver.findElement(By.cssSelector(locator)).click();
			
		}
		
		else if(locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locator)).click();
			
		}
		
		else if (locatortype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locator)).click();
		}
		
	}
	
	
	
	void fillInput(String locator,String locatortype, String InputType,String Value)
	{
		if(locatortype.equalsIgnoreCase("xpath"))
		{
			
			if(InputType.equalsIgnoreCase("textbox"))
			{
				
				
			driver.findElement(By.xpath(locator)).sendKeys(Value);
			}
			
			else if(InputType.equalsIgnoreCase("radio"))
			{
				
				
			driver.findElement(By.xpath(locator)).click();
			}
			
			else if(InputType.equalsIgnoreCase("dropdown"))
			{
				Select select = new Select(driver.findElement(By.xpath(locator)));
				
				select.selectByValue(Value);
				
			}
			
			
			
			
			
			
			
		}
		
		else if(locatortype.equalsIgnoreCase("css"))
		
		{
			if(InputType.equalsIgnoreCase("textbox"))
			{
			
			driver.findElement(By.cssSelector(locator)).sendKeys(Value);
			}
			
		}
		
		else if(locatortype.equalsIgnoreCase("id"))
		{
			if(InputType.equalsIgnoreCase("textbox"))
			{
			
			driver.findElement(By.id(locator)).sendKeys(Value);
			}
		}
		
		else if (locatortype.equalsIgnoreCase("name"))
		{
			if(InputType.equalsIgnoreCase("textbox"))
			{
			
				
			driver.findElement(By.name(locator)).sendKeys(Value);
			}
			
			
		}
		
		
		
		
	}
	void ExplictWait(String locator,String locatortype,long Timeout)
	{
		
		if(locatortype.equalsIgnoreCase("xpath"))
		{
		
		
		WebDriverWait wait = new WebDriverWait(driver,Timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
		
		}
		
		if(locatortype.equalsIgnoreCase("css"))
		{
			
			WebDriverWait wait = new WebDriverWait(driver,Timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
			
		}
		
		if(locatortype.equalsIgnoreCase("id"))
		{
			WebDriverWait wait = new WebDriverWait(driver,Timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
			
		}
		
		if(locatortype.equalsIgnoreCase("name"))
		{
			WebDriverWait wait = new WebDriverWait(driver,Timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
			
			
		}
		
		
		
		
	}
	
	void actionClick(String locator,String type)
	{
		
	}
	
	void Screenshot()
	{
		
	}
	
	
}

package Testngg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Testngcheckk {
	ChromeDriver driver ;
	@Test
	public void f() {
	  
	    String baseUrl = "https://www.toolsqa.com/";
	      
	         
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	        String testTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
}

	

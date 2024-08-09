package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fbloginn;

public class Fbloginnpom {
	
	
  WebDriver driver;
  
  @BeforeTest
  
  public void test1()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
  }
  
  @Test
  public void testt()
  {
	  Fbloginn fb=new Fbloginn(driver);
	  fb.login("abc","34qwe");
	  fb.click();
	  
	  
	
	
	  
  }
  

}

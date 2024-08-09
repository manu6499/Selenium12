package Testngg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionn {
	
	ChromeDriver driver;


	@BeforeTest
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	
	}
@Test
public void test1()
{
	String exp="facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(exp, actual);
}
}
//if(actual.contains(exp))
//{
//	System.out.println("test passed");
//}
//else 
//{
//	System.out.println("test failed ");
//}

//}

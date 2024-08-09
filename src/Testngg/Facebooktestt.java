package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebooktestt {
	
	
WebDriver driver;

@BeforeTest

public void setup()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
}


@Test
public void test1()
{
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
	if(logo.isDisplayed())
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
		
		
	}	
}

}

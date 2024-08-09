package Testngg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logoover {
	
	
	
	ChromeDriver driver;


	@BeforeTest
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp");
	
	
}

@Test
public void testing()
{
	WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
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

package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registerrrex {
	
	
	WebDriver driver;

	@BeforeTest

	public void setup()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/");
		
	}


@Test
public void test1()
{
	//driver.findElement(By.xpath("//*[@id=\"departure\"]"));
	driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
}
while (true)
{
	Thread.sleep(2000);
	String dec="december";
}

}

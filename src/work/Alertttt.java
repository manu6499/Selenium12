package work;

import org.junit.Before;


import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertttt {
	
	ChromeDriver driver;


	@Before
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/molly/OneDrive/Documents/alerting.html");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert s= driver.switchTo().alert();
		s.accept();
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		
		String actual=button.getAttribute("value");
		String exp="display alert box";
		if(actual.equals(exp))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("neymar");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("jr");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
		
	}
	}

}

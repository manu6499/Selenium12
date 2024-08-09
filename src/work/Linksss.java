package work;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksss {
	
	
	ChromeDriver driver;


	@Before
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		List <WebElement> listt=driver.findElements(By.tagName("a"));
		System.out.println("numeber of links = "+listt.size());		
	
	
	for(WebElement link : listt)
	{
		String href=link.getAttribute("href");
		
		if(href!=null)
		{
			System.out.println(href);
		}
	}
	
	}

}

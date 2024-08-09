package work;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {

	ChromeDriver driver;
	@Before
	public void start() 
	{
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	}
	@Test
	public void test1()
	{
		String exp="yt";
		String actual=driver.getTitle();
		System.out.println("title ="+actual);
		
		if(actual.contains(exp))
		{
			System.out.println("pased");
		}
		else
		{
			System.out.println("failed");
		}
		
	}
	
	@After
	public void end()
	{
	driver.quit();	
	}
	
}

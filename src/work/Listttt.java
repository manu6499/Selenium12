package work;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listttt {
	
	
	
ChromeDriver driver;


@Before
public void tags()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
}

@Test
public void test1()
{
	List <WebElement> listt=driver.findElements(By.tagName("a"));
	System.out.println("numeber of links = "+listt.size());
}


}

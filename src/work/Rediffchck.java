package work;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffchck {
	
	ChromeDriver driver;


	@Before
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
	WebElement button=driver.findElement(By.xpath("//*[@valign=\"bottom\"]/input[2]"));
	
	String actual=button.getAttribute("value");
	String exp="check avaliability";
	if(actual.equals(exp))
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
	
	}
}

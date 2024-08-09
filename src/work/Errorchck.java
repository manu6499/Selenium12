package work;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Errorchck {
	
	ChromeDriver driver;


	@Before
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void copy()
	{
		WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("neymar");
		Actions act=new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
	}
}

package work;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathhh {
	
ChromeDriver driver;


@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}

@Test
public void test1()
{
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile",Keys.ENTER);
	driver.findElement(By.id("nav-cart-count")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	driver.findElement(By.name("email")).sendKeys("qwet@gamail.comm",Keys.ENTER);
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"new hamburger menu\"]")).click();
   
	
	

}

}

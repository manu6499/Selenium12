package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testngg.Automationtest;

public class Automationtestpom {
	
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		
		Automationtest atn=new Automationtest(driver);
		atn.popup();
		atn.datepicker();
		atn.search();
		
	}

}

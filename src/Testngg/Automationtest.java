package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Automationtest {
	
	WebDriver driver;

	public void popup() throws InterruptedException
	{
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id=\\\"largeModal\\\"]/div/div/button"));

	}
	public Automationtest(WebDriver driver)
	{
	this.driver=driver;
	}
	public void book() throws InterruptedException
	{
	
	Thread.sleep(3008);
	driver.findElement(By.xpath("//*[@id=\"FromCity\"]")).sendKeys("Bangalore", Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"ToCity\"]")).sendKeys("Goa", Keys.ENTER);
	
	}

	public void datepicker() throws InterruptedException
	{
	String exp="August 2024";
	while(true)
	{
		Thread.sleep(3000);
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/table/thread/tr[1]/th[2]")).getText();
		if(act.equals(exp))
		{
		break;
		}
		else
		{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[3]")).click();
		}
		}
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[7]")).click();
	}
	 public void search() throws InterruptedException
		{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"demo\"]/section[2]/div/div[2]/div/div/div/div[[3]/button")).click();
		}	
	
}



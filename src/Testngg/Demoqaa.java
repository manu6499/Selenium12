package Testngg;


import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demoqaa {
	
	ChromeDriver driver;

	
	public void tags()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
	}
@Test
	public void copy()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.clickAndHold(drag).moveToElement(drop);
		act.perform();
	}
}

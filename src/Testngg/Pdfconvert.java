package Testngg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pdfconvert {
	
	WebDriver driver;
	@BeforeTest
	public void pdf() throws AWTException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		fileupload("path");
		
	}
@Test
public void fileupload(String p) throws AWTException, InterruptedException
{
	StringSelection stringselect=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
	Thread.sleep(2000);
    Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyPress(KeyEvent.VK_ENTER);
	
}
}

package Testngg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendedreport {
	
	
	WebDriver driver;
	ExtentHtmlReporter extentt;
	ExtentReports report;
	ExtentTest test;
	
	
	
	@BeforeTest
	
	public void testt()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		extentt=new ExtentHtmlReporter("./Myreport/report.html");
		extentt.config().setTheme(Theme.DARK);
		extentt.config().setReportName("automation report");
		extentt.config().setDocumentTitle("my report");
		report=new ExtentReports();
		report.attachReporter(extentt);
		report.setSystemInfo("os"," windwows11");
		report.setSystemInfo("host", "general");
		report.setSystemInfo("tested by", "abcc");
	}
	@Test
	public void title()
	{
		test=report.createTest("test1");
		String exp="facebook";
		String actual=driver.getTitle();
	
	if(actual.contains(exp))
	{		System.out.println("test passed");
	}
	else 
	{
	System.out.println("test failed ");
	}
	}
	
@Test
public void logo()
{
	test=report.createTest("test2");
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
	if(logo.isDisplayed())
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}		
}
	
	
	@AfterTest
	public void finish()
	{
		report.flush();
	}
		
}


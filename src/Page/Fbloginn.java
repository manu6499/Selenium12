package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginn {
	
	WebDriver driver;
	

		By email=By.id("email");
		By password=By.id("password");
		By login=By.id("login");
		
	public Fbloginn(WebDriver driver2) {
			this.driver=driver;
		}



	
	
	
	public void sigup(String emaill,String passwordd)
	{
		driver.findElement(email).sendKeys(emaill);
		driver.findElement(password).sendKeys(passwordd);
	}
	public void login()
	{
		driver.findElement(login).click();
		
	}

		



}

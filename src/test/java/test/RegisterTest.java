package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.HomePage;
import page.RegisterPage;
import util.BrowserFactory;

public class RegisterTest 
{	
	@Test
	public void registering()throws InterruptedException
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");

		HomePage home=PageFactory.initElements(driver,HomePage.class);
		
		home.NavigatingToAccount("pbs@gmail.com");
		
		RegisterPage register= PageFactory.initElements(driver, RegisterPage.class);

		register.registering("Daisy", "Lee", "abc123", "WoodSide", "11345", "123elmstreet", "3476751899");
		
		register.SelectDay("13");
		
		register.SelectMonth("May");
		
		register.SelectYear("1989");
		
		register.SelectState("New York");
		
		register.SelectCountry("United States");
		
		register.ClickRegister();	
		
		driver.close();
		driver.quit();	
	}	
		
}



package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	@Test
	@Parameters({"email","password","Name","Company","Email","phone","address","City","State","Zip","country"})
	public void AddContactinpage(String email,String password,String Name,String Company,String Email,String phone,String address,String City,String State,String Zip,String country) throws InterruptedException{
		
		   
	WebDriver driver=BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

	LoginPage login= PageFactory.initElements(driver, LoginPage.class);

	login.Login(email, password);

	HomePage home=PageFactory.initElements(driver, HomePage.class);

	home.VerifyPageLogin();

	home.NavigatingToAddContact();

	AddContact contact=PageFactory.initElements(driver, AddContact.class);

	contact.FillingUpAddressForm(Name, Company, Email, phone, address, City, State, Zip, country);

	driver.close();
	driver.quit();

	}	

}

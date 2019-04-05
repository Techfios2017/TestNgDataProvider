package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ShoppingPage;
import util.BrowserFactory;

public class CheckoutTest {
	
	@Test	
	public void SelectCheckout() throws InterruptedException
	{		
		   
	WebDriver driver=BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php?id_category=8&controller=category");
	
	ShoppingPage store=PageFactory.initElements(driver, ShoppingPage.class);
	
	store.BuyingDress();
	
	store.VerificationInorderPage();
	
	driver.close();
	
	driver.quit();
	
	}
	
}

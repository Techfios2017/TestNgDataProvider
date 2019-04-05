package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingPage {

	WebDriver driver;

	public ShoppingPage(WebDriver ldriver){
		
		this.driver=ldriver;	
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='subcategories']/ul/li[3]/div[1]/a/img")	
	WebElement SummerDress;
	
	@FindBy(how=How.XPATH,using=".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")	
	WebElement SpecificDress;
	
	@FindBy(how=How.XPATH,using=".//*[@id='add_to_cart']/button")	
	WebElement AddCart;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Proceed to checkout')]")	
	WebElement ProceedToCheckout;
	
	@FindBy(how=How.ID,using="cgv")	
	WebElement TermsandServiceBox;
	
	@FindBy(how=How.XPATH,using="//a[@title='Pay by bank wire']")	
	WebElement paybybankwire;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'I confirm my order')]")	
	WebElement Confirmpayment;
	
	@FindBy(how=How.XPATH,using="//a[@title='Back to orders']")	
	WebElement BackToorders;
	
	@FindBy(how=How.XPATH,using="//h1[@class='page-heading bottom-indent']")	
	WebElement OrderHistory;
	
	@FindBy(how=How.XPATH,using="//a[@class='color-myaccount']")	
	WebElement Referenceorder;	

	
	public void BuyingDress()throws InterruptedException
	{	
		SummerDress.click();
		SpecificDress.click();
		AddCart.click();
		ProceedToCheckout.click();
		ProceedToCheckout.click();
		ProceedToCheckout.click();
		ProceedToCheckout.click();
		TermsandServiceBox.click();
		ProceedToCheckout.click();
		paybybankwire.click();
		Confirmpayment.click();
		BackToorders.click();		
	}
	
	public void VerificationInorderPage()
	{		
		OrderHistory.isDisplayed();
		Referenceorder.isDisplayed();		
	}

}

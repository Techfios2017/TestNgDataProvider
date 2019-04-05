package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	WebDriver driver;

	public RegisterPage(WebDriver ldriver){
		
		this.driver=ldriver;	
	}

	@FindBy(how=How.ID,using="id_gender2")	
	WebElement MrsRadio;
	
	@FindBy(how=How.ID,using="customer_firstname")	
	WebElement firstname;
	
	@FindBy(how=How.ID,using="customer_lastname")	
	WebElement lastname;		
	
	@FindBy(how=How.NAME,using="passwd")	
	WebElement password;
	
	@FindBy(how=How.ID,using="days")	
	WebElement daydrop;
	
	@FindBy(how=How.ID,using="months")	
	WebElement monthdrop;
	
	@FindBy(how=How.NAME,using="years")	
	WebElement yeardrop;
	
	@FindBy(how=How.ID,using="city")	
	WebElement city;
	
	@FindBy(how=How.ID,using="id_state")	
	WebElement statedrop;
	
	@FindBy(how=How.ID,using="postcode")	
	WebElement postal;
	
	@FindBy(how=How.ID,using="address1")	
	WebElement address;
	
	@FindBy(how=How.ID,using="id_country")	
	WebElement countrydrop;
	
	@FindBy(how=How.ID,using="phone_mobile")	
	WebElement mobilephone;
	
	@FindBy(how=How.XPATH,using=">>//span[contains(text(),'Register')]")	
	WebElement registerbutton;
	
	public void registering(String name,String lname, String pass, String city1, String postal1,String address1, String phone1){
		
		MrsRadio.click();
		firstname.sendKeys(name);
		lastname.sendKeys(lname);
		password.sendKeys(pass);
		city.sendKeys(city1);
		postal.sendKeys(postal1);
		address.sendKeys(address1);
		mobilephone.sendKeys(phone1);		
	}

	public void SelectDay(String status)
	{
	     Select day= new Select(daydrop);
	     day.selectByVisibleText(status);
	}
	     
	 public void SelectMonth(String status)
	 {
		Select month= new Select(monthdrop);
		month.selectByVisibleText(status);
      }
	 
	 public void SelectYear(String status)
	 {
		Select year= new Select(yeardrop);
		year.selectByVisibleText(status);
     }
	 
	 public void SelectState(String status)
	 {
		Select state= new Select(statedrop);
		state.selectByVisibleText(status);
     }
	 
	 public void SelectCountry(String status)
	 {
		Select country= new Select(countrydrop);
		country.selectByVisibleText(status);
     }
	 
	 public void ClickRegister()
	 {
		 registerbutton.click();
	 }
	 
	 
}
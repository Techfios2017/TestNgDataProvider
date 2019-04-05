package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
WebDriver driver;

public HomePage(WebDriver ldriver){
	
	this.driver=ldriver;	
}

@FindBy(how=How.ID,using="email_create")
WebElement EmailTextbox;

@FindBy(how=How.XPATH,using="//form[@id='create-account_form']//span[1]")
WebElement CreateAnAccountButton;


public void NavigatingToAccount(String email) {
	EmailTextbox.sendKeys(email);
	CreateAnAccountButton.click();
	
}

}

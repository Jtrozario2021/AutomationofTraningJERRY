package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountDetails {
	public WebDriver driver;
	@FindBy(name="customerName") WebElement CustomerName;
	@FindBy(name = "email") WebElement Email;
	@FindBy(id="ap_password") WebElement Appassword;
	@FindBy(id="ap_password_check") WebElement Appasswordcheck;
	@FindBy(id="continue") WebElement Continuebtn;
public void customerName() {
	CustomerName.sendKeys("Jerry Rozario");
	Email.sendKeys("jerry.com");
	Appassword.sendKeys("12345678");
	Appasswordcheck.sendKeys("12345678");
	Continuebtn.click();
	
	

}

}

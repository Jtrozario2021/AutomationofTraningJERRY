package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountDetails {
	public WebDriver driver;
	@FindBy(name="customerName") WebElement CustomerName;
	@FindBy(name = "email") WebElement Email;
	@FindBy(id="ap_password") WebElement Appassword;
	@FindBy(id="ap_password_check") WebElement Appasswordcheck;
	@FindBy(id="continue") WebElement Continuebtn;

public CreateAccountDetails(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}

public void customerName(WebDriver driver) {
	this.driver=driver;
	CustomerName.sendKeys("Jerry Rozario");
}
public void email(WebDriver driver) {
	this.driver=driver;
	Email.sendKeys("jerry@hotmail.com");
}
public void Appassword(WebDriver driver) {
	this.driver=driver;
Appassword.sendKeys("12345678");
}
public void Appasswordcheck(WebDriver driver) {
	this.driver=driver;
	Appasswordcheck.sendKeys("12345678");
}
public void Continuebtn(WebDriver driver) {
	this.driver=driver;
	Continuebtn.click();
}	
	

}



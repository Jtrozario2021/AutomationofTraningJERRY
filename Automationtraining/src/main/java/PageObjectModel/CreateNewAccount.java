package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {
	public WebDriver driver;
	@FindBy(id="auth-create-account-link")WebElement CreateAccount;
public CreateNewAccount(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
public void CreateAccount() {
	CreateAccount.click();
}

}

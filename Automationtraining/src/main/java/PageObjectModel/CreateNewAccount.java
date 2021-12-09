package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccount {
	public WebDriver driver;
	@FindBy(id="auth-create-account-link")WebElement CreateAccount;
	
public void CreateAccount() {
	CreateAccount.click();
}

}

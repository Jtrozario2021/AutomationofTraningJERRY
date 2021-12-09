package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/*TestNg Framework*/

public class Home {
	public WebDriver driver;
	//All the locator specific page should be entered their
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement Sign;
	//Page factory constructor
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	//Create the methods for each element according to its action
public void SignToClick() {
	Sign.click();
}
}

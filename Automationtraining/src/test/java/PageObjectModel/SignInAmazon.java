package PageObjectModel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
	public WebDriver driver;
  @Test
  public void f() {
	  Home ob=new Home(driver);
	  ob.SignToClick();
	  SignInPage it=new SignInPage(driver);
	  it.EmailFieldSendkeys();
	  it.ContinueButton();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}

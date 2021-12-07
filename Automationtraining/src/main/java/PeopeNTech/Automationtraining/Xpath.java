package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath    {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//Xpath (absolute)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement fields=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		fields.sendKeys("jerry");
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("123456789");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
		//Xpath (relative) most use in selenium
		//tagname[@attributename="value"]
//		WebElement button=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
//		button.click();
		
	
		
	}

}

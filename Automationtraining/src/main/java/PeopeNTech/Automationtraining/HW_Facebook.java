package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_Facebook {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement signon = driver.findElement(By.xpath("//*[@aria-label='Email or phone number']"));
		signon.sendKeys("jerry.com");
		Thread.sleep(3000);
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys("1234");
		Thread.sleep(3000);
		WebElement logbtn=driver.findElement(By.name("login"));
		logbtn.click();
			
		
	
	}

}

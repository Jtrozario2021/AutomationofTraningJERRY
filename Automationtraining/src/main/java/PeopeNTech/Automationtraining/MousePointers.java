package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePointers {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.navigate().to("http://amazon.com");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				Actions ob=new Actions(driver);
				WebElement viewds=driver.findElement(By.id("nav-link-accountList"));
				ob.moveToElement(viewds).build().perform();
				Thread.sleep(3000);
				WebElement books=driver.findElement(By.linkText("Prime Membership"));
				ob.moveToElement(books).click().build().perform();
				
				
				
				
				
				
				
				
				
				
				
				Thread.sleep(10000);
				driver.close();
					

	}

}

package PeopeNTech.Automationtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kboard {
	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
					driver= new ChromeDriver();
					driver.navigate().to("http://amazon.com");
					driver.manage().window().maximize();
			//Implicit wait
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					WebElement serchfields=driver.findElement(By.id("twotabsearchtextbox"));
					serchfields.sendKeys("Computer");
					Actions ob=new Actions(driver);
					ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
					ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
					serchfields.clear();
					serchfields.click();
					ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			//Explicit wait		
//					WebElement serchfields1=driver.findElement(By.id("twotabsearchtextbox"));
//					WebDriverWait wt=new WebDriverWait(driver, 25);
//					wt.until(ExpectedConditions.elementToBeClickable(serchfields1));
					
					
					
					
					driver.close();
		
		
		
	}

}

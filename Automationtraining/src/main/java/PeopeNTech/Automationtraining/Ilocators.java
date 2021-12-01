package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Locators:
		//1) ID
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement SearchIcon=driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon.click();
		Thread.sleep(3000);
		
		//2) Link text (find <a href to make sure it is a link)
		WebElement bestsellers= driver.findElement(By.linkText("Best Sellers"));
		bestsellers.click();
		Thread.sleep(3000);
		
		//3) Partial Link Text
		WebElement linktx=driver.findElement(By.partialLinkText("Epic"));
		linktx.click();
		Thread.sleep(3000);
		
		//4) Name
		WebElement searchfield=driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("computer");
							//as we cannot declear same variable we change the name by searchicon1
		WebElement SearchIcon1=driver.findElement(By.id("nav-search-submit-button")); 
		SearchIcon1.click();
		
	
		
		

	}

}

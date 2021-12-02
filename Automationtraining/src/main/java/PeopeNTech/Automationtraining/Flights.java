package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement flights=driver.findElement(By.xpath("//*[text()='Flights']"));
		flights.click();
		Thread.sleep(3000);
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement selectdatefor=driver.findElement(By.xpath("//*[@aria-label='Dec 25, 2021']"));
		selectdatefor.click();
		WebElement donebutton=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
		donebutton.click();
		
	
	}

}

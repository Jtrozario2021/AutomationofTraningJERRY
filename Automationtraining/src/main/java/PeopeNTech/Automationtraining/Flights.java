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
		Thread.sleep(3000);
		WebElement returndate=driver.findElement(By.xpath("//*[@aria-label='Dec 31, 2021']"));
		returndate.click();
		Thread.sleep(2000);
		WebElement donebutton=driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
		donebutton.click();
		Thread.sleep(2000);
		WebElement returning=driver.findElement(By.id("d2-btn"));
		returning.click();
		Thread.sleep(2000);
		WebElement selectdate2=driver.findElement(By.xpath("//*[@aria-label='Jan 4, 2022']"));
		selectdate2.click();
		Thread.sleep(2000);
		WebElement returndate2=driver.findElement(By.xpath("//*[@aria-label='Jan 21, 2022']"));
		returndate2.click();

	
	}

}

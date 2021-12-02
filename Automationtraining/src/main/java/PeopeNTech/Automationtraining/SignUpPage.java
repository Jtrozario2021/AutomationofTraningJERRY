package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(3000);
		WebElement MonthOfBirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(MonthOfBirth);
		ob.selectByValue("1");
		
		WebElement Birthday=driver.findElement(By.name("birthday_day"));
		Select birth=new Select(Birthday);
		birth.selectByVisibleText("6");
		
		WebElement birthday_year=driver.findElement(By.name("birthday_year"));
		Select year=new Select(birthday_year);
		year.selectByValue("2014");
		//select female option
		WebElement femaletoggle=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
		femaletoggle.click();
		Thread.sleep(4000);
		//select male option
		WebElement maletoggle=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		maletoggle.click();
		
		
		
	}

}

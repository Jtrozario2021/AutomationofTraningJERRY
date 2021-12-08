package PeopeNTech.Automationtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpwindows {
public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		WebElement books=driver.findElement(By.linkText("Kindle Books"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		books.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		String Current=driver.getWindowHandle();
		System.out.println(Current);
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String>iterators=windowhandles.iterator();
		String Parentwindowhandle=iterators.next();
		String Childwindowhandle=iterators.next();
		System.out.println("Parentwindowhandle=" +Parentwindowhandle);
		System.out.println("Childwindowhandle=" +Childwindowhandle);
		driver.switchTo().window(Childwindowhandle);
		WebElement exclusive=driver.findElement(By.linkText("Kindle Exclusives"));
		exclusive.click();
		
		driver.switchTo().window(Parentwindowhandle);
		WebElement Fashion=driver.findElement(By.linkText("Fashion"));
		Fashion.click();
		
		
		

	}

}

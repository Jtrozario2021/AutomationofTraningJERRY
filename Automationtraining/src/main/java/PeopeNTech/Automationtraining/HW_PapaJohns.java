package PeopeNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW_PapaJohns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerry\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://papajohns.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//menu link
		WebElement bestsellers= driver.findElement(By.linkText("MENU"));
		bestsellers.click();
		Thread.sleep(2000);
		//select pizza (your choice)
		WebElement orderfree=driver.findElement(By.xpath("//*[@aria-label='Hawaiian BBQ Chicken Pizza Order Now ']"));
		orderfree.click();
		Thread.sleep(2000);
		//address insert
		WebElement country=driver.findElement(By.xpath("//*[@name='country']"));
		country.click();
		Select countryy=new Select (country);
		countryy.selectByVisibleText("USA");
		Thread.sleep(2000);
		WebElement deliveryaddress1=driver.findElement(By.xpath("//*[@placeholder='Example: 123 Main St.']"));
		deliveryaddress1.sendKeys("3010 Duncan Drive, Adelphi, MD, USA");
		Thread.sleep(2000);
		WebElement zipin=driver.findElement(By.xpath("//*[@id='locations-usa-zipcode']"));
		zipin.sendKeys("20783");
		Thread.sleep(2000);
		WebElement submitt=driver.findElement(By.xpath("//*[@class='button button-large']"));
		submitt.click();
		Thread.sleep(3000);
		//details// size selection// quantity
		WebElement details=driver.findElement(By.xpath("//*[@aria-label='Details link of Hawaiian BBQ Chicken Pizza']"));
		details.click();
		Thread.sleep(2000);
		WebElement pizzasize=driver.findElement(By.xpath("//*[@id='Hawaiian BBQ Chicken Pizza-size-select']"));
		Select pizsize=new Select(pizzasize);
		pizsize.selectByVisibleText("Extra Large");
		Thread.sleep(2000);
		WebElement quantity=driver.findElement(By.xpath("//*[@id='hawaiian-bbq-chicken-quantity-select']"));
		Select qty=new Select (quantity);
		qty.selectByVisibleText("1");
		Thread.sleep(2000);
		//add to cart// go to cart//
		WebElement addcart=driver.findElement(By.xpath("//*[@class='button button--small d-none d-md-inline-block']"));
		addcart.click();
		Thread.sleep(2000);
		WebElement gotocart=driver.findElement(By.xpath("//*[@class='nav-main-item nav-main-cart']"));
		gotocart.click();
		Thread.sleep(2000);
		//edit your pizza
		WebElement editproduct=driver.findElement(By.xpath("//*[@class='edit-product']"));
		editproduct.click();
		Thread.sleep(3000);
		//cheese tab
		WebElement cheesee=driver.findElement(By.xpath("//*[@id='ngb-tab-1']"));
		cheesee.click();
		Thread.sleep(3000);
		WebElement selectcheese=driver.findElement(By.id("61-selected"));
		selectcheese.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectcheeseside=driver.findElement(By.id("61-right"));
		selectcheeseside.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectcheeseqty=driver.findElement(By.id("61-qty-extra"));
		selectcheeseqty.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		//meat tab
		WebElement meats=driver.findElement(By.xpath("//*[@id='ngb-tab-2']"));
		meats.click();
		Thread.sleep(3000);
		WebElement selectbaconside=driver.findElement(By.id("24-left"));
		selectbaconside.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectbaconqty=driver.findElement(By.id("24-qty-extra"));
		selectbaconqty.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectchkside=driver.findElement(By.id("33-right"));
		selectchkside.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectchkqty=driver.findElement(By.id("33-qty-extra"));
		selectchkqty.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectpepperoni=driver.findElement(By.id("35-selected"));
		selectpepperoni.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectbeef=driver.findElement(By.id("20-selected"));
		selectbeef.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		WebElement selectbeefqty=driver.findElement(By.id("20-qty-extra"));
		selectbeefqty.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		//update cart
		WebElement updatecart=driver.findElement(By.xpath("//*[@aria-label='Update Cart']"));
		updatecart.click();
		Thread.sleep(3000);
		WebElement checkoutbtn=driver.findElement(By.xpath("//*[@class='button button--red button--medium button-margin button--checkout']"));
		checkoutbtn.click();
		Thread.sleep(3000);
		//contact and payment
		WebElement fname=driver.findElement(By.xpath("//*[@id='contact-firstname']"));
		fname.sendKeys("Jerry");
		WebElement lname=driver.findElement(By.xpath("//*[@id='contact-lastname']"));
		lname.sendKeys("Rozario");
		WebElement email=driver.findElement(By.xpath("//*[@id='contact-email']"));
		email.sendKeys("jerry.rozario@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//*[@id='phone-number']"));
		phone.sendKeys("2409383924");
		Thread.sleep(3000);
		WebElement ccardno=driver.findElement(By.xpath("//*[@id='credit-card-number']"));
		ccardno.sendKeys("1010101010101010");
		WebElement ccardname=driver.findElement(By.xpath("//*[@id='credit-card-name']"));
		ccardname.sendKeys("Jery Rozario");
		WebElement expmonth=driver.findElement(By.xpath("//*[@id='credit-card-expiration-month']"));
		Select expmonthh=new Select(expmonth);
		expmonthh.selectByValue("05 - May");
		WebElement expyear=driver.findElement(By.xpath("//*[@id='credit-card-expiration-year']"));
		Select expyearr=new Select(expyear);
		expyearr.selectByValue("2026");
		WebElement zip=driver.findElement(By.xpath("//*[@id='billing-zipcode']"));		
		zip.sendKeys("20783");
		WebElement seccode=driver.findElement(By.xpath("//*[@id='credit-card-cvv']"));		
		seccode.sendKeys("007");
		Thread.sleep(3000);
		WebElement tip=driver.findElement(By.xpath("//*[@id='tip20']"));		
		tip.click();
		Thread.sleep(2000);
		WebElement input=driver.findElement(By.xpath("//*[@id='input']"));		
		input.click();
		Thread.sleep(2000);
		WebElement ordervalidate=driver.findElement(By.xpath("//*[@id='validate-order']"));		
		ordervalidate.click();
		Thread.sleep(3000);
		WebElement placeorder=driver.findElement(By.xpath("//*[@id='place-your-order']"));		
		placeorder.click();
		
		
		Thread.sleep(30000);
		driver.close();
	}

}

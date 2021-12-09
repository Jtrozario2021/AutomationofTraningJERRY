package PeopeNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnnotations {
  @Test
  public void f() {
	  System.out.println("1.  test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("2.  before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("3.  after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
   System.out.println("4.  before class annotation");
	  	
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("5.  after class menthod annotation");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("6.  before test method annotation");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("7.  after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("8.  before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("9.  after suite annotation");
  }

}

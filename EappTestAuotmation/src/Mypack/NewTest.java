package Mypack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver _driver;
  
	@Test
  public void f() throws InterruptedException {
		  _driver.get("http://eaapp.somee.com/");
		  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  _driver = new ChromeDriver();

  }

  @AfterTest
  public void afterTest() {
	  _driver.quit();
	  
  }

}

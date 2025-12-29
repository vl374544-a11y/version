package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class baseclass1 {
	WebDriver d;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d= new ChromeDriver();
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
  }

  @AfterClass
  public void afterClass() {
  }

}

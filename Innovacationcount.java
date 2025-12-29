package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Innovacationcount {
  @Test(invocationCount =2)
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  WebDriver d = new ChromeDriver();
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
	  
	  
	  
  }
}

package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Project_Starting_basic {
	WebDriver d;
  @Test(groups= {"valid"})
  public void vaild() throws InterruptedException {
	  d.findElement(By.name("txt_unam")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	  Thread.sleep(6000);
	  d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
  }
  @Test(groups= {"invalid"})
  public void invalid() throws InterruptedException {
	  d.findElement(By.name("txt_unam")).sendKeys("sylixjd");
	  Thread.sleep(2000);
	  d.findElement(By.id("txt_pass")).sendKeys("adminskk");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	 Alert s =  d.switchTo().alert();
	 s.accept();
	 Thread.sleep(2000);
	 
  }
  @Test(groups= {"illegal"})
  public void illegal() throws InterruptedException {
	  d.findElement(By.name("txt_unam")).sendKeys("sylix&&&jd");
	  Thread.sleep(2000);
	  d.findElement(By.id("txt_pass")).sendKeys("admins%$%^kk");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	 Alert s =  d.switchTo().alert();
	 s.accept();
	 
  }
  @Test(groups= {"blank"})
  public void blank() throws InterruptedException {
	  d.findElement(By.name("txt_unam")).sendKeys(" ");
	  Thread.sleep(2000);
	  d.findElement(By.id("txt_pass")).sendKeys(" ");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	  Thread.sleep(2000);
	 Alert s =  d.switchTo().alert();
	 s.accept();

  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdrive.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d= new ChromeDriver();
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
  }

  @AfterClass
  public void afterClass() {
  
  }

}

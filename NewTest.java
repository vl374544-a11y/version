package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTest extends baseclass1 {
	@Test(priority=-1)
	  public void vaild() throws InterruptedException {
		  d.findElement(By.name("txt_unam")).sendKeys("sylix");
		  d.findElement(By.id("txt_pass")).sendKeys("admin");
		  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		  Thread.sleep(6000);
		  d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
	  }
	  @Test(priority=2)
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
	  @Test(priority=0)
	  public void illegal() throws InterruptedException {
		  d.findElement(By.name("txt_unam")).sendKeys("sylix&&&jd");
		  Thread.sleep(2000);
		  d.findElement(By.id("txt_pass")).sendKeys("admins%$%^kk");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		 Alert s =  d.switchTo().alert();
		 s.accept();
		 
	  }
	  @Test(priority=1)
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

	  
  
}

package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTest2 extends baseclass1{
	public class NewTest extends baseclass1 {
		@Test(priority=-1)
		  public void vaild() throws InterruptedException {
			  d.findElement(By.name("txt_unam")).sendKeys("sylix");
			  Thread.sleep(3000);
			  d.findElement(By.id("txt_pass")).sendKeys("admin");
			  Thread.sleep(3000);
			  d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
			  Thread.sleep(6000);
			  
		}
		
			  @Test(priority=0)
			  public void details() throws InterruptedException {
				 
				  d.findElement(By.linkText("Customermanagement")).click();
				  Thread.sleep(3000);
			  d.findElement(By.name("ctl00$ContentPlaceHolder1$txt_compname")).sendKeys("viji&co");
			  Thread.sleep(3000);
			  d.findElement(By.id("ContentPlaceHolder1_txt_addr")).sendKeys("kendaiyur");
			  Thread.sleep(3000);
			  d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_compph\"]")).sendKeys("334455664");
		  }
}
}
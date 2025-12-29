package BASICS;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
	       WebDriver d = new ChromeDriver();
	       d.get("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		  String oldwindow = d.getWindowHandle();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span")).click();
		  Thread.sleep(2000);
		 Set<String> handles = d.getWindowHandles();
		 for(String newwindow : handles )
		 {
			 d.switchTo().window(newwindow);
		 }
		 Thread.sleep(2000);
	WebElement email = d.findElement(By.id("email"));
	email.sendKeys("viji@gmail.com");
	Thread.sleep(2000);
	WebElement msg = d.findElement(By.id("message"));
	msg.sendKeys("i am here ");
	Thread.sleep(2000);
	d.switchTo().window(oldwindow);
	// switching to window inputing text and returning back to parent window
	
	
	d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span")).click();
	int numofwindows = d.getWindowHandles().size();
	System.out.println(numofwindows);
	

	
	WebElement close = d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
	close.click();
	Set<String> parentwindows = d.getWindowHandles();  
	for(String closeall :parentwindows)
	{
		if(!closeall.equals(oldwindow))
		{
			d.switchTo().window(closeall);
			d.close();
		}
	}
	
	System.out.println("no of" +parentwindows.size());
	
	
	
	
	
	
	
	
	
	}

}

package Automation1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement name = d.findElement(By.id("name"));
		name.sendKeys("viji");
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys("viji@gmail.com");
		d.findElement(By.name("gender")).click();
		d.findElement(By.id("monday")).click();
		
	JavascriptExecutor js = (JavascriptExecutor)d;
			js.executeScript("window.scrollBy(0,1000)");
		
		d.findElement(By.cssSelector("option[value='white']")).click();
		d.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")).click();
		
		Thread.sleep(2000);
		d.findElement(By.id("txtDate")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		
		Thread.sleep(2000);
		WebElement month =d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		month.click();
		Select s= new Select(month);
		s.selectByVisibleText("Jul");
		Thread.sleep(2000);
		
		WebElement date = d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		date.click();
		Select sel= new Select(date);
		sel.selectByValue("2025");
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
		
		WebElement file = d.findElement(By.id("singleFileInput"));
		file.sendKeys("C:\\Users\\user\\Downloads\\sampleFile.jpeg");
		d.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button")).click();
		
		List col = d.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));
		System.out.println(" no of" + col.size());
		
		List row = d.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/td[1]"));
		System.out.println("no of"+ row.size());
		
		WebElement a = d.findElement(By.id("alertBtn"));
		a.click();
		Thread.sleep(2000);
		Alert c = d.switchTo().alert();
		Thread.sleep(2000);
		d.switchTo().alert();
	c.accept();
		
	WebElement b = d.findElement(By.id("confirmBtn"));
	b.click();
	Thread.sleep(2000);
	d.switchTo().alert();
	Thread.sleep(2000);
	c.dismiss();
	
	WebElement C = d.findElement(By.id("promptBtn"));
	C.click();
	Thread.sleep(2000);
	d.switchTo().alert();
	Thread.sleep(2000);
	c.sendKeys("viji");
	c.accept();

WebElement tab = d.findElement(By.cssSelector("button[onclick='myFunction()']"));
tab.click();

String oldwindow = d.getWindowHandle();

Set <String> alltab = d.getWindowHandles();
for(String newtab: alltab)
{
	d.switchTo().window(newtab);
}
Thread.sleep(2000);
d.switchTo().window(oldwindow);

//WebElement mouse = d.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
//Thread.sleep(2000);
Actions A = new Actions(d);
//Thread.sleep(2000);
//A.moveToElement(mouse).perform();
//Thread.sleep(2000);
//mouse.click();
//Thread.sleep(2000);
//d.findElement(By.linkText("Laptops")).click();

WebElement dou = d.findElement(By.cssSelector("button[ondblclick='myFunction1()']"));
A.doubleClick(dou).build().perform();

WebElement drag = d.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
WebElement drop = d.findElement(By.id("droppable"));
A.dragAndDrop(drag, drop).build().perform();

WebElement silder = d.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
Thread.sleep(2000);
for(int i =50; i<=70; i++)
{
	silder.sendKeys(Keys.ARROW_RIGHT);
}




	}

}

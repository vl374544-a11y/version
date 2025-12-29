package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.id("name")).sendKeys("vijayalakshmi");
		d.findElement(By.id("email")).sendKeys("madhu@gmail.com");
		WebElement dr = d.findElement(By.xpath("//*[@id=\"phone\"]"));
		dr.sendKeys("8907449390 ");
		d.findElement(By.cssSelector("textarea#textarea")).sendKeys("mettupalayam,CBE");
		WebElement female = d.findElement(By.xpath("//*[@id=\"female\"]"));
		female.click();
		d.findElement(By.xpath("//*[@id=\"tuesday\"]")).click();
		WebElement country = d.findElement(By.id("country"));
		Select s = new Select(country);
	s.selectByValue("usa");
	d.findElement(By.id("colors")).click();
	WebElement Deer = d.findElement(By.xpath("//*[@id=\"animals\"]/option[3]"));
	Deer.click();
	WebElement date = d.findElement(By.id("datepicker"));
	System.out.println(d.getTitle().length());
	System.out.println(d.getCurrentUrl());
	System.out.println(d.getPageSource());
	d.manage().window().maximize();
		
	}

}

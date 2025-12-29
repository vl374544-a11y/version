package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/tooltip/");
		//d.switchTo().frame(0);
		//d.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("65"); 
		//By index method
		
		
	}

}

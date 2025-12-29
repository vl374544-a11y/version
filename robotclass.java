package BASICS;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.google.com/");
		dri.manage().window().maximize();
		WebElement gmail = dri.findElement(By.linkText("Gmail"));
		gmail.click();
Actions s = new Actions(dri);
		s.contextClick(gmail).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		
		
		
	}

}

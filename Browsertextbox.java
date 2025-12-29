package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertextbox {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDrive.chrome.Drive", "C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://practicetestautomation.com/practice-test-login/");
d.findElement(By.id("username")).sendKeys("student");
d.findElement(By.id("password")).sendKeys("Password123");
d.findElement(By.id("submit")).click();
	}

}

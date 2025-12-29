package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedtext_partiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\chropath\\chromedriver.exe ");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		//d.findElement(By.linkText("Create new account")).click();
		d.findElement(By.partialLinkText("ate")).click();// same at linktext defe is partial enter from one wordform

	}

}

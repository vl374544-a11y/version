package Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webBrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebBrower.chrome.drive", " C:\\chropath\\chromedriver .exe");
		WebDriver d = new ChromeDriver(); 
		d.get("https://www.myntra.com/");

	}

}

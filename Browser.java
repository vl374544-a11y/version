package BASICS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
//WebDrive - Browser-Interface(interface implement class->
	//ChromeDrive, GeckoDrive,IEDrive
	//Selenium WebDriver-implementing classes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("WebDrive.chrome.driver", "C:\\chropath.chromedriver.exe)");
   WebDriver d = new ChromeDriver();
   
   d.get("https://www.flipkart.com/");


	}

}

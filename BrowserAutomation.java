package Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chropath\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(null);

	}

}

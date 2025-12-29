package BASICS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---incognito");
		System.setProperty(" webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver dri = new ChromeDriver(opt);
		dri.get("https://in.bookmyshow.com/");
		

	}

}

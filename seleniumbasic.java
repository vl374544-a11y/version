package Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver", "C:\\chropath\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.purplle.com/ ");
		System.out.println(drive.getTitle());
		//System.out.println(drive.getCurrentUrl());
		System.out.println(drive.getPageSource());
		int title = drive.getTitle().length();
		int Url = drive.getCurrentUrl().length();
		int page = drive.getPageSource().length();
		System.out.println(title);
		System.out.println(Url);
		System.out.println(page);
		
				

	}

}

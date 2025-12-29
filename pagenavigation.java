package BASICS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagenavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\chropath\\chromedriver.exe ");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.purplle.com/");
		Thread.sleep(4000);
	dri.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	dri.navigate().to("https://discoverpilgrim.com/");
	Thread.sleep(3000); 
	dri.navigate().to("https://www.nykaa.com/");
	dri.navigate().back();
	dri.navigate().back();//back left arrow
	dri.navigate().back();
	dri.navigate().forward();//right arrow, navigation between page
	

	}

}

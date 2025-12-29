package BASICS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.amazon.in");
Thread.sleep(4000);
JavascriptExecutor js = (JavascriptExecutor)d;
js.executeScript("window.scrollBy(0,3000)");
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,-1500)");



		
		
		
		
	}

}

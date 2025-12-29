package BASICS;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class movetotab1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(4000);
		
	((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab2.get(1)); //get index start 0 , tab count start 1 
		d.get("https://in.bookmyshow.com");
                                                                          
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab3 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3.get(2)); 
		d.get("https://www.smula.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		
		ArrayList<String> tab1r = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab1r.get(0));
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		ArrayList<String> tab2r = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab2r.get(1));
		d.get("https://www.nykaa.com/");
		Thread.sleep(3000);
		
		ArrayList<String> tab3r = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3r.get(2));
		d.get("https://www.purplle.com/");
		Thread.sleep(3000);
		
		ArrayList<String> tab4r = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3r.get(2));
		d.get("https://www.purplle.com/");
		Thread.sleep(3000);
		
		
	}

}

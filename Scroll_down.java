package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://automationexercise.com/test_cases");
		
		//1) scroll page up to pixel number
	JavascriptExecutor js = (JavascriptExecutor)d;
//		js.executeScript("window.scrollBy(0,1000)");
//	js.executeScript("window.scrollBy(0,-1000)");
		//scroll down is not a webelements it is out of page
		
	//scroll the page still the text element is visible
		WebElement s = d.findElement(By.xpath("//*[@id=\"form\"]/div/div[21]/div/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();",s);
		

	}

}

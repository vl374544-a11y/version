package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javascriptexecutor_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
    WebElement drop =  d.findElement(By.id("prefix"));
      Select s = new Select(drop);
      s.selectByIndex(3);
      JavascriptExecutor js = (JavascriptExecutor)d;
     WebElement c = d.findElement(By.id("pension"));
      js.executeScript("argument[0].click",c);
      
      
	}

}

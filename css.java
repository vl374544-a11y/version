package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.in/");
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("kirchenset");//tag#id
		dr.findElement(By.cssSelector("input[type='submit']")).click();
		//tag[attribute=value]
	}

}

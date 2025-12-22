package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\chropath\\chromedriver.exe ");
		WebDriver d = new ChromeDriver();
		d.get("https://practice.expandtesting.com/hovers#google_vignette");
		d.manage().window().maximize();
WebElement us2 = d.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[2]/img"));
Thread.sleep(2000);
WebElement us1 = d.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[1]/img"));
Thread.sleep(2000);
WebElement us3 = d.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[3]/img"));

Actions s = new Actions(d);
Thread.sleep(2000);
s.moveToElement(us2).perform();
Thread.sleep(2000);
s.moveToElement(us3).perform();
Thread.sleep(2000);
s.moveToElement(us1).perform();






	}

}

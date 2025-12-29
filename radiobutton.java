package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.Driver", "C:\\\\chropath\\\\chromedriver.exe ");
WebDriver d = new ChromeDriver();
d.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
d.findElement(By.xpath("//*[@id=\"radio-button2\"]")).click();

//WebElement black = d.findElement(By.xpath("//*[@id=\"radio-button2\"]"));
//black.click();
//Thread.sleep(2000);

	}

}

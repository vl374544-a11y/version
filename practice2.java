package Automation1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://practice.expandtesting.com/#google_vignette");
d.findElement(By.xpath("/html"))	;
JavascriptExecutor js = (JavascriptExecutor)d;
js.executeScript("window.scrollBy(0,6000)");

File pr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(pr,new File("C:\\Users\\user\\Desktop\\New folder\\p2.png"));

		

	}

}

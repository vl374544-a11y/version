package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filepload_download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver ", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
d.get("https://demoqa.com/upload-download");
d.findElement(By.id("downloadButton")).click();

WebElement upload = d.findElement(By.xpath("//*[@id=\"uploadFile\"]"));

upload.sendKeys("C:\\Users\\user\\Downloads\\Manual Trap Questions.pd");

	
	}

}

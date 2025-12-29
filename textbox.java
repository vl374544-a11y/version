package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.drive", "C:\\chropath\\chromedriver.exe ");
WebDriver Drive = new ChromeDriver();
Drive.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
Drive.findElement(By.name("fullname")).sendKeys("Vijayalakshmi");
Drive.findElement(By.name("email")).sendKeys("viji@gmail.com");
Drive.findElement(By.id("address")).sendKeys("81/D kendaiyur,near UB star ,3 valli salai ,mettupalayam");
Drive.findElement(By.id("password")).sendKeys("viji12345");
Drive.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input")).click();
	}

}

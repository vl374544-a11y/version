package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver", "C:\\chropath.chromedriver.exe ");
		WebDriver dri = new ChromeDriver();
		dri.get("https://practice.expandtesting.com/dropdown");
		WebElement Country = dri.findElement(By.id("country"));
		Select s = new Select(Country);
		//s.selectByIndex(3);
		//s.selectByVisibleText("Aruba");
		s.selectByValue("AW");

	}

}

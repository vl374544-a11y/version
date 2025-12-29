package BASICS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDrive.chrome.driver", "C:\\chropath.chromedriver.exe)");
		   WebDriver d = new ChromeDriver();
		   
		   d.get("https://www.google.com/");
WebElement s = d.findElement(By.xpath("//*[@id=\"input\"]"));
s.sendKeys("testing");

List<WebElement>autoSuggest = d.findElements(By.cssSelector("div[jsname='UUbT9']")); //Manylist will store in list
//take cssSelector for Attributes jsname, jscontroller 
for(WebElement a :autoSuggest)
{
	System.out.println("values are ="+ a.getText());
	if(a.getText().equals("testing courses online"));
	a.click();
	
	
		
}
	}

}

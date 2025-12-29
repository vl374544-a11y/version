package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobtn_checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.Drive","C:\\chropath\\chromedriver.exe ");
WebDriver D = new ChromeDriver();
D.get("https://www.ironspider.ca/forms/checkradio.htm");

WebElement red = D.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
//we can not call method at same line so using webelements red we can access it 
red.click();
Thread.sleep(3000);
WebElement orange = D.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[4]"));
orange.click();
Thread.sleep(4000);
WebElement purple = D.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[6]")); 
purple.click();
Thread.sleep(2000);

WebElement mozila = D.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
mozila.click();
Thread.sleep(3000);

	}
}

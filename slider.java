package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver ", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/sliders/");
		d.switchTo().frame(0);
		
WebElement slider = d.findElement(By.xpath("//*[@id=\"red\"]/span"));
Thread.sleep(7000);
//left: 30%;               
for(int a=100; a>=20; a--)	
{
slider.sendKeys(Keys.ARROW_LEFT);
}

Thread.sleep(50);
for(int i=20; i<=80; i++) 
	Thread.sleep(50);
{
	slider.sendKeys(Keys.ARROW_RIGHT);
}


WebElement red = d.findElement(By.xpath("//*[@id=\\\"green\\\"]/span "));
red.click();
for(int r = 60 ;r>=5; r--) {
	red.sendKeys(Keys.ARROW_LEFT);
}
Thread.sleep(50);
for(int e =5 ; e<=50; e++) {
	red.sendKeys(Keys.ARROW_RIGHT);
}




	}

}

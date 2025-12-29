package BASICS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DC_Rc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver", "C:\\chropath.chromedriver.exe ");
		WebDriver dri = new ChromeDriver();
		dri.get("https://demo.guru99.com/test/simple_context_menu.html");
		dri.manage().window().maximize();
		WebElement r = dri.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions a = new Actions(dri);
		a.contextClick(r).perform();
		Thread.sleep(3000);
		dri.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]")).click();
		Alert b = dri.switchTo().alert();
		Thread.sleep(3000);
		b.accept();
		
	}

}

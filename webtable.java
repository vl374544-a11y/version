package BASICS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
	       WebDriver d = new ChromeDriver();
	       d.get("https://demo.guru99.com/test/web-table-element.php");
	
	List col = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));//[] need to remove in th
	System.out.println("No of cols are "+ col.size());
	
	List rows = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));//[] need to remove in td
	System.out.println("No of row are"+ rows.size());
	
	for(int i = 1; i<=5; i++)
	{
	d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[1]")).click();
	//need to insert the variable in rows(tr)
	Thread.sleep(3000);
	d.navigate().back();
	}                                
}
}
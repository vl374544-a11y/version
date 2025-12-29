package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver ", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
d.get("https://ui.vision/demo/webtest/dragdrop/");
WebElement one = d.findElement(By.id("one"));
WebElement two = d.findElement(By.xpath("//*[@id=\"two\"]"));
WebElement th = d.findElement(By.id("three"));
WebElement fo = d.findElement(By.xpath("//*[@id=\"four\"]"));
WebElement fi = d.findElement(By.id("five"));
WebElement Ma =d.findElement(By.id("bin"));

Actions ac = new Actions(d);
ac.dragAndDrop(one,Ma).build().perform();
Thread.sleep(2000);
ac.dragAndDrop(fi, Ma).build().perform();
Thread.sleep(2000);
ac.dragAndDrop(th, Ma).build().perform();
Thread.sleep(2000);
ac.dragAndDrop(fo, Ma).build().perform();
Thread.sleep(2000);
ac.dragAndDrop(two, Ma).build().perform();
 

	}

}

package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver Dri = new ChromeDriver();
		Dri.get("https://demo.automationtesting.in/Register.html");
		WebElement d =  Dri.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
d.sendKeys("vijaya");
d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("lakshmi");
d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("mettupalayam");
d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("viji@gmail.com");






	}

}

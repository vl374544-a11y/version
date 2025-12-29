package BASICS;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriver {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://practicetestautomation.com/practice-test-login/");
		dri.manage().window().maximize();
		Thread.sleep(3000);
		FileInputStream a = new FileInputStream("C:\\Users\\user\\Desktop\\task1.xls");
		Workbook b = Workbook.getWorkbook(a);
		Sheet s= b.getSheet(0);
		
		for(int i = 1;i<=5;i++)
		{
			String username = s.getCell(0, i).getContents();
			String password = s.getCell(1, i).getContents();
			dri.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			Thread.sleep(3000);
			dri.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(3000);
			dri.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			Thread.sleep(3000);	
			dri.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

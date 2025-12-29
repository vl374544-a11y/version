package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C:\\chropath\\chromedriver.exe ");
		WebDriver D = new ChromeDriver();
		D.get("https://www.jotform.com/build/253043511982454?s=templates&salesforceTemplate=1");
		D.findElement(By.id("first_1")).sendKeys("vijaya");
		D.findElement(By.id("middle_1")).sendKeys("lakshmi");
		D.findElement(By.id("last_1")).sendKeys("lakshmni ");
		D.findElement(By.id("input_9")).sendKeys("itachi@gamil.com");
		D.findElement(By.id("input_48_addr_line1")).sendKeys("81/D kendaiyur");
		D.findElement(By.id("input_48_addr_line2")).sendKeys(" near UB Star");
		D.findElement(By.id("input_48_city")).sendKeys("3 vali salai");
		D.findElement(By.id("input_48_state")).sendKeys("tamilnadu");
		D.findElement(By.id("input_48_postal")).sendKeys("6536778");
		D.findElement(By.id("input_6_full")).sendKeys("9874467790");
		D.findElement(By.id("input_3_addr_line1")).sendKeys("kendaiyur");
		D.findElement(By.name("input_3_addr_line2")).sendKeys("UB Star");
		

	}

}

	package BASICS;
	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class POPupAlert {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://vinothqaacademy.com/alert-and-popup/");
	WebElement sim = dr.findElement(By.name("alertbox"));
	sim.click();//Clicking this button triggers an alert popup
	Thread.sleep(3000);
Alert al = dr.switchTo().alert();//Changes focus from the webpage to the alert popup
	Thread.sleep(3000);
	System.out.println(al.getText());
	Thread.sleep(3000);
	al.accept();
	
	WebElement con = dr.findElement(By.name("confirmalertbox"));
	con.click();
	Thread.sleep(3000);
	dr.switchTo().alert();
	Thread.sleep(3000);
	//al.accept();
		al.dismiss();
		
	WebElement pop = dr.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button"));
	pop.click();
	Thread.sleep(3000);
	dr.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(al.getText());
	Thread.sleep(3000);
	al.sendKeys("yes");
	Thread.sleep(3000);
	al.accept();
	
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

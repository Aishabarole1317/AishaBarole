package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	    ChromeOptions co =new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    
	        WebDriver driver =new ChromeDriver(co);
	        driver.manage().window().maximize();
	        
		       driver.get("https://aiflyingreturns.b2clogin.com/");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//input[@id='signInName']")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("aisha2@gmail.com");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//input[@id='password']")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//button[@id='next']")).click();
		       
		     
	}

}

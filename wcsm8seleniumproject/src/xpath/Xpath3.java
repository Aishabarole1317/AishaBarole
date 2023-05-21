package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		    ChromeOptions co =new ChromeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    
		        WebDriver driver =new ChromeDriver(co);
		        driver.manage().window().maximize();
		        
		    driver.get("https://www.airindia.in/");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='to']")).click();
		    Thread.sleep(2000); 
		    driver.findElement(By.xpath("//input[@id='to']")).sendKeys("Goa, Dabolim Airport, GOI, India, IN");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='_depdateeu1']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='_depdateeu1']")).sendKeys("08/04/2023");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='_retdateeu1']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='_retdateeu1']")).sendKeys("25/04/2023");
		    
	}
}

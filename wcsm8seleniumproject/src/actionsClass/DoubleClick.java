package actionsClass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("http://aisha/login.do");
		    driver.findElement(By.name("username")).sendKeys("admin");
		    driver.findElement(By.name("pwd")).sendKeys  ("manager");
		    
		    driver.findElement(By.id("LoginButton")).click();
		  
		    driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		    driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		    
		    driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		     WebElement target=driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		     Actions act=new Actions(driver);
		     act.doubleClick(target).perform();
		     driver.get("https://www.flipkart.com/");
		     driver.findElement(By.xpath("//button[text()='✕']")).click();
			WebElement target1=driver.findElement(By.xpath("//span[text()='Cart']"));
			 Actions act1=new Actions(driver);
		     act1.doubleClick(target1).perform();  
		     
		     
                                        
		     
		     
				
		    
		    
		  
	}

}

package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//open Browser
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		    driver.get("file:///C:/Users/Aishwarya/Desktop/wcsm8/multiSelectdropdown.html");
		     WebElement dropdown= driver.findElement(By.name("menu"));
		      Select Sel=new Select(dropdown);
		      Thread.sleep(4000);
		      Sel.selectByIndex(3);
		      
		      for(int i=0;i<=6;i++)
		      {
		    	  Sel.selectByIndex(i);
		    	  Thread.sleep(2000);
		    	  
		      }
		        
		    
	}

}

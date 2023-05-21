package operational;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
			
			 WebDriver driver =new ChromeDriver();
			 driver.manage().window().maximize();
				
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		     driver.get("file:///C:/Users/Aishwarya/Desktop/wcsm8/multiSelectdropdown.html");
		     WebElement dropdown=driver.findElement(By.name("menu"));
		      
		     Select sel=new Select(dropdown);
		     List<WebElement> alloptions =sel.getOptions();
		     
		     //to read the list of webelement use looping statements
		     
		     //for loop
		     for(int i=0;i<alloptions.size();i++)	    	 
		     {
		    	 String option=alloptions.get(i).getText();
		    	 System.out.println(option);
		     }
		    	
		   
		     
		     

	}

}

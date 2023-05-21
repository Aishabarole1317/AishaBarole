package keywordDriverPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib{
       
	static WebDriver driver;
	
	public void openBrowser()
	{
		Flib flib = new Flib();
	   String browserValue = flib.readPropertyData("./data/config.properties","browser");
	   String url = flib.readPropertyData("./data/config.properties","url");
	   
	   if(browserValue.equals("Chrome"))
	   {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver.new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(url);
	  }
	   else if(browserValue.equals("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver.new firefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url); 
	   }
	      
	
	
	
	}

}

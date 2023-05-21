package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		// to maximize browser
	 	driver.manage().window().maximize();
	 	  
	 	driver.get("https://www.google.com/");
	 	Thread.sleep(2000);
	 	driver.switchTo().activeElement().sendKeys("phoebe buffaay",Keys.ENTER);
	 	driver.findElement(By.className("1NPNe")).click();
	}

}

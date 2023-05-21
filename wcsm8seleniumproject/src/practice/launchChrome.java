package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		{
			new ChromeDriver();
		}
		
		
	}

}


package practice;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("Webdriver.edge.driver","./drivers/msedgedriver.exe");
		{
			new EdgeDriver();
			
		}

	}

}

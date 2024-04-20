package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_initializationbase {
	static WebDriver driver;
	public static WebDriver browser(String browsername) {
	
	switch(browsername)
	{
	case "chrome":
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_jar\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		break;	
	}
	case "edge":
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium_jar\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		break;	 
	}
	case "firefox":
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_jar\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		break;	
	}
	
	}
	return driver;
}
}
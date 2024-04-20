package seleniumwebdriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_initialization {

	static WebDriver driver;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browsername=sc.next();
		driver=Browser_initializationbase.browser(browsername);
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium_jar\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://quizforexam.com/java-program-to-sum-of-even-elements/");
	driver.get("http://automationpractice.com/index.php");
	driver.close();
	}

}

package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_initialization {

	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.get("https://quizforexam.com/java-program-to-sum-of-even-elements/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().forward();
		driver.navigate().back();
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com/");*/


		//driver.close(); 


	}

}

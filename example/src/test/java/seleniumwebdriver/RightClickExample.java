package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		 WebElement ele=driver.findElement(By.id("signupModalButton"));
		 act.moveToElement(ele).contextClick().build().perform();
		 act.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		 
		


	}

}

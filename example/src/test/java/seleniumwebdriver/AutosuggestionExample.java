package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");		
		driver.manage().window().maximize();
		driver.findElement(By.id("source")).sendKeys("chen"/*,Keys.ENTER*/);
		Thread.sleep(2000);
		Actions act=new Actions(driver);

		String source=driver.findElement(By.id("source")).getAttribute("value");
		System.out.println(source);

		act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		driver.findElement(By.id("destination")).sendKeys("coim");
		Thread.sleep(2000);
		act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		String dest=driver.findElement(By.id("destination")).getAttribute("value");
		System.out.println(dest);
		
		//compare source and destination values
		if(source.equals(dest))
		{
			System.out.println("not valid");
		}
		
	/*WebDriverWait wai=new WebDriverWait(driver,15);
	wai.until(ExpectedConditions.invisibilityOfAllElements(source));*/	
	}

}

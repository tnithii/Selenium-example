package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousedraggingExample {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/");

//driver.findElement(By.id("product-menu-toggle")).click();
//driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div[1]/ul[1]/li[3]/a/div[3]")).click();
	WebElement ele=driver.findElement(By.id("product-menu-toggle"));
Actions act=new Actions(driver);
act.moveToElement(ele).build().perform();
driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div[1]/ul[1]/li[3]/a/div[3]")).click();
	}

}

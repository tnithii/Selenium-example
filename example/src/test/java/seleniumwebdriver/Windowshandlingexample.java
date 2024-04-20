package seleniumwebdriver;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandlingexample {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("blinkingText")).click();
		System.out.println(driver.getTitle());
		//String windowname=driver.getWindowHandle();--->it will return only current window name.
		//                                          ---->so string is enough to store.
		//Store window names in Set
	Set<String> win=driver.getWindowHandles();
	System.out.println(win);
	//iterate those window names and store it in a separate string values
	Iterator<String> itr=win.iterator();
	String win1=itr.next();
	String win2=itr.next();
	//Switch to one window to another
	driver.switchTo().window(win1);
	System.out.println(driver.getTitle());
	driver.switchTo().window(win2);
	System.out.println(driver.getTitle());
	//Accessing home page in second window
	driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[1]/a")).click();
	//type username in first window
	driver.switchTo().window(win1);
	driver.findElement(By.id("username")).sendKeys("nith");
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

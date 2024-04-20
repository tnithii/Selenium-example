package seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			//driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
			
			//Click on alert with ok
			driver.findElement(By.className("btn-danger")).click();
			Alert newalert=driver.switchTo().alert();
			newalert.accept();
			//driver.switchTo().alert().accept();//we can create object for alert class or give accept() method directly.
												//either (21 and 22) or 23.
			
			//Click on alert with ok and cancel
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.className("btn-primary")).click();
			//Alert secondalert=driver.switchTo().alert(); //no need to create multiple objects for alert class.
			                                               //one object(newalert) is for Alert class.
			//cancel
			newalert.dismiss();
			
			//Click on alert with textbox
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			driver.findElement(By.className("btn-info")).click();
			//Alert thirdalert=driver.switchTo().alert();
			
			driver.switchTo().alert().sendKeys("hello");
			//thirdalert.sendKeys("hello"); // either we can use 36th line or 37th
			newalert.accept();
			
			
			
	}

}

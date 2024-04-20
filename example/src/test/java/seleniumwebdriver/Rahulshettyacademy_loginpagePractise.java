package seleniumwebdriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rahulshettyacademy_loginpagePractise {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Reading a file
		File f=new File("C:\\Users\\Home\\Selenium_Starts\\Seleniumwebdriver\\Config.properties");
		FileInputStream fis=new FileInputStream(f);
		//creating object for properties
		Properties p=new Properties();
		p.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//passing Url from file
		driver.get(p.getProperty("Url"));
		driver.manage().window().maximize();
		//Use
		driver.findElement(By.id(p.getProperty("Username_locator"))).sendKeys(p.getProperty("Username_value"));
		//entering passwordd
		driver.findElement(By.id(p.getProperty("Password_locator"))).sendKeys(p.getProperty("Password_value"));
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[1]/span[2]")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		System.out.println(ele.getText());
		Select s1=new Select(ele);
		s1.selectByVisibleText("Student");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[1]/div/div[2]/button")).click();
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("hello");
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/app-checkout/div/div[2]/label")).click();
		driver.findElement(By.className("btn-lg")).click();
		String ele1=driver.findElement(By.xpath("/html/body/app-root/app-shop/div/app-checkout/div[2]/div")).getText();
				if(ele1.equals("×Success! Thank you! Your order will be delivered in next few weeks :-)"));
				{
				System.out.println("valid");	
				}
		

	}

}

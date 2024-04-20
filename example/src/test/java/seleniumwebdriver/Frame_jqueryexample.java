package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_jqueryexample {

	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/");
	//click on selectable
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
	//go to html and give control+F. search for iframe and copy its class name. this process id for switch over one frame to another frame.
	WebElement frm=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frm);
	//Click on item5
	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).click();
	
	//Switch back to original frame.
	driver.switchTo().defaultContent();
	//click on droppable
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	
	}

}

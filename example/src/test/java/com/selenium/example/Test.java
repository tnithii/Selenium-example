package com.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test {
		public static void main(String[] args) {
			//WebDriverManager.chromedriver().setup();
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Documents\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//WebDriver driver=WebDriverManager.edgedriver().create();
			driver.get("https://www.google.com/");
			 driver.findElement(By.name("q")).sendKeys("world map"+Keys.ENTER);
	}
	
	}
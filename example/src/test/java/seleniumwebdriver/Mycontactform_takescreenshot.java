package seleniumwebdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mycontactform_takescreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		int uppperlinksize=driver.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul")).size();
		for(int i=1;i<=uppperlinksize;i++)
		{
			int lowerlinksize=driver.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li")).size();
			for(int j=1;j<=lowerlinksize;j++)
			{
				driver.findElement(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li["+j+"]/a")).click();
				TakesScreenshot screenshot = (TakesScreenshot)driver;
				File scr=screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scr, new File("C:\\Screenshots_Selenium\\a"+System.currentTimeMillis()+".jpeg"));

			}
		}


	}

}



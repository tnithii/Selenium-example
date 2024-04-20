package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GodaddyAutomation {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String expectedtitle="Domain Names, Websites, Hosting & Online Marketing Tools GoDaddy";
		if(expectedtitle.equals(title))
		{
			System.out.println("Valid");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String expectedurl="https://www.godaddy.com/";
		if(expectedurl.equals(url))
		{
			System.out.println("Valid url");
		}
		
		String pagesource=driver.getPageSource();
	
		if(pagesource.contains(title))
		{
		System.out.println("The page title is present in page source");
		}
		else
			System.out.println("no");
		//System.out.println(pagesource);
		//Assert.assertEquals(title,"Domain Names, Websites, Hosting & Online Marketing Tools GoDaddy");
		
		driver.close();
	}

}

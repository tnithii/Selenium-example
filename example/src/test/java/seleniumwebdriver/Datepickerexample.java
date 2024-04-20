package seleniumwebdriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepickerexample {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Datepickerexample de=new Datepickerexample();
		Date d = new Date();
		SimpleDateFormat ds = new SimpleDateFormat("dd-MMMMyyyy");
		String date = ds.format(d);
		System.out.println(date);
		String spliter[] = date.split("-");
		
		String month_year = spliter[1];
		System.out.println(month_year);
		
		String date1 = spliter[0];
		System.out.println(date1);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).click();

		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']//label")).click();
		de.selectdate(date1,month_year); 
	}
		  public void selectdate(String date2,String month_year1) 
		  { 
			  List<WebElement> monthnames=driver.findElements(By.xpath("//div[@class='DayPicker-Caption']//div"));
			 for(int i=0;i<monthnames.size();i++)
			 {
				 
				 System.out.println(monthnames.get(i).getText());
				 String month_to_select=monthnames.get(i).getText();
				 if(month_to_select.equals(month_year1))
				 {
					 List<WebElement> days=driver.findElements(By.xpath("//div[@class='DayPicker-Week']//div//div//p"));
					 for(WebElement d:days)
					 {
						String day=d.getText();
						System.out.println(day);
						if(day.equals(date2))
						{
							d.click();
						}
					 }
					
				 }
				 
			 }
		  }
		 
	
}

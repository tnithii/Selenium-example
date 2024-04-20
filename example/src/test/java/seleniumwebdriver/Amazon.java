package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//driver.close();
	String title=driver.getTitle();
	System.out.println(title);
	String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	if(expectedtitle.equals(title))
	{
	System.out.println("valid");
	}
	int num=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a")).size();
	System.out.println(num);
	String[] expagetitle=new String[9];
	 expagetitle[1]="Amazon.in Bestsellers: The most popular items on Amazon";
	expagetitle[2]="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	 expagetitle[3]="Help - Amazon Customer Service";
	 expagetitle[4]="Amazon.in - Today's Deals";
	 expagetitle[5]="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
	 expagetitle[6]="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	 expagetitle[7]="Amazon.in: Amazon Prime";
	 expagetitle[8]="Home Store: Buy Home & Kitchen products online at best prices in India - Amazon.in";
	
	 for(int i=1;i<=8;i++)
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a["+i+"]")).click();
		String pagetitle=driver.getTitle();
				
		if(expagetitle[i].equals(pagetitle))
		{
			System.out.println(pagetitle+"--->is the expected one.");
		}
	}
	
}

}

package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_User_Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	//sign in
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	//enter emailid in create an account
	driver.findElement(By.id("email_create")).sendKeys("tnithi123456@gmail.com");
	//click on create acc
	driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click(); 
	Thread.sleep(5000);

	//Radio button
	driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	//first name
	driver.findElement(By.name("customer_firstname")).sendKeys("nit"); 
	//driver.findElement(By.id("customer_firstname")).sendKeys("nit");
	//Lastname
	driver.findElement(By.id("customer_lastname")).sendKeys("mani");
	//Email
	//driver.findElement(By.id("email")).sendKeys("tnithi12345@gmail.com");
	
	//password
	driver.findElement(By.id("passwd")).sendKeys("abc123");
	
	//dropdown for days
	WebElement ele1=driver.findElement(By.id("days"));
	System.out.println(ele1);
	Select s1=new Select(ele1);
	s1.selectByVisibleText("2");
	
	//drop down for months 
	WebElement ele2=driver.findElement(By.id("months"));
	System.out.println(ele2);
	Select s2=new Select(ele2);
	s2.selectByVisibleText("January");
	
	//dropdown for year
	WebElement ele3=driver.findElement(By.id("years"));
	System.out.println(ele3);
	Select s3=new Select(ele3);
	s3.selectByVisibleText("1990");
	
	
	//checkbox newsletter
	driver.findElement(By.id("newsletter")).click();
	
	//firstname
	driver.findElement(By.id("firstname")).sendKeys("nit");
	//lastname
	driver.findElement(By.id("lastname")).sendKeys("mani");
	//company
	driver.findElement(By.id("company")).sendKeys("abcs");
	//Addrress
	driver.findElement(By.id("address1")).sendKeys("20,1st street");
	
//City
	driver.findElement(By.id("city")).sendKeys("plano");
	
	//Dropdown for state
	WebElement ele4=driver.findElement(By.id("id_state"));
	System.out.println(ele4);
	Select s4=new Select(ele4);
	s4.selectByVisibleText("Texas");
	
	//Zipcode
	
	driver.findElement(By.id("postcode")).sendKeys("75024");
	
	//Country
	
	WebElement ele5=driver.findElement(By.id("id_country"));
	System.out.println(ele5);
	Select s5=new Select(ele5);
	s5.selectByVisibleText("United States");
	
	//Additional information
	driver.findElement(By.id("other")).sendKeys("test");
	
	//Mobile phone
	driver.findElement(By.id("phone_mobile")).sendKeys("5678901234");
	//Assign an address alias for future reference. 
	driver.findElement(By.id("alias")).sendKeys("20,1st street, plano,tx");
	
	//register button
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	
	WebElement ele6=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	String message=ele6.getText();
	String expectedmessage="Welcome to your account. Here you can manage all of your personal information and orders.";
	if(message.equals(expectedmessage))
	{
		System.out.println("valid");
	}
	
	
	}
	
}

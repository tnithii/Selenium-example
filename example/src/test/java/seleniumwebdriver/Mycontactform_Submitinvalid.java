package seleniumwebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class Mycontactform_Submitinvalid {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//WebDriverManager.edgedriver().setup();
	//WebDriver driver=new EdgeDriver();
	driver.get("https://www.mycontactform.com/samples/rental.php");
	
	WebElement ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9,ele10,ele11,ele12,ele13,ele14;
	WebElement ele1=driver.findElement(By.name("q[22]"));
	System.out.println(ele1.getText());
	
	Select s=new Select(ele1);
	s.selectByVisibleText("Mrs.");
	//Text box
	driver.findElement(By.name("q[1]")).sendKeys("Nithya");
	driver.findElement(By.name("q[2]")).sendKeys("");
	driver.findElement(By.id("email")).sendKeys("tnithii@gmail.com");
	driver.findElement(By.id("q[3]")).sendKeys("7896541230");
	
	//radio button
	driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[7]/td/font/input[2]")).click();
	//radio button for Preferred Contact Time
	driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[9]/td/font/input[2]")).click();
	//Dropdown
	ele2=driver.findElement(By.name("q[6]"));
	System.out.println(ele2.getText());
	Select s1=new Select(ele2);
	s1.selectByVisibleText("Within 4 Weeks");
	
	//Dropdown Propertytype(Preferred)
	ele3=driver.findElement(By.id("q[19]"));
	System.out.println(ele3.getText());
	
	Select s3=new Select(ele3);
	s3.selectByVisibleText("Townhouse");
	
	//Dropdown Propertytype(Alternate)
	ele4=driver.findElement(By.id("q[20]"));
	ele4.getText();
	Select s4=new Select(ele4);
	s4.selectByVisibleText("Duplex");
	
	//Dropdown Price(Minimum)
	ele5=driver.findElement(By.id("q[7]"));
	System.out.println(ele5.getText());
	Select s5=new Select(ele5);
	s5.selectByVisibleText("$700");
	
	//Dropdown Price(maximum)
	ele6=driver.findElement(By.id("q[8]"));
	System.out.println(ele6.getText());
	Select s6=new Select(ele6);
	s6.selectByVisibleText("$1500");
	
	//dropdown Square Footage (Minimum)
	ele7=driver.findElement(By.name("q[9]"));
	System.out.println(ele7.getText());
	Select s7=new Select(ele7);
	s7.selectByVisibleText("1400");
	
	//Dropdown Square Footage (maximum)
	ele8=driver.findElement(By.name("q[10]"));
	System.out.println(ele8.getText());
	Select s8=new Select(ele8);
	s8.selectByVisibleText("1500");
	
	//Preferred Area 
	driver.findElement(By.name("q[11]")).sendKeys("Plano");
	
	//Number of Bedrooms (Minimum) *
	
	ele9=driver.findElement(By.id("q[12]"));
	System.out.println(ele9.getText());
	Select s9=new Select(ele9);
	s9.selectByVisibleText("2");
	
	//Number of Bedrooms (Maxinum) *
	ele10=driver.findElement(By.id("q[16]"));
	System.out.println(ele10.getText());
	Select s10=new Select(ele10);
	s10.selectByVisibleText("3");
	
	//Number of Bathrooms (Minimum) 
	ele11=driver.findElement(By.id("q[13]"));
	System.out.println(ele11.getText());
	Select s11=new Select(ele11);
	s11.selectByVisibleText("2");

	//Number of Bathrooms (Maximum) 
	ele12=driver.findElement(By.id("q[17]"));
	System.out.println(ele12.getText());
	Select s12=new Select(ele12);
	s12.selectByVisibleText("3");
	
	//Pets? *
	ele13=driver.findElement(By.id("q[14]"));
	System.out.println(ele13.getText());
	Select s13=new Select(ele13);
	s13.selectByVisibleText("No");
	
	//Smoker?
	driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[24]/td/font/input[2]")).click();
	
	//Comments, questions, or other information:
	driver.findElement(By.name("q[21]")).sendKeys("Test");
	
	//Submit button
	driver.findElement(By.name("submit")).click();
	
	//error message
	ele14=driver.findElement(By.xpath("//*[@id=\"header\"]/p"));
	System.out.println(ele14.getText());
	String message=ele14.getText();
	if(message.equals("ERROR"))
	{
		System.out.println("Invalid inputs");
	}
	
	
	

	}

}


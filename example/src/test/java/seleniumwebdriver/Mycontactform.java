package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Mycontactform {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=WebDriverManager.edgedriver().create();
		driver.get("https://www.mycontactform.com/samples.php");
		
		//text box
		 driver.findElement(By.name("subject")).sendKeys("Maths");
		 WebElement e=driver.findElement(By.name("subject"));
			System.out.println(e.getAttribute("value"));
			
		 driver.findElement(By.id("email")).sendKeys("tnithii@gmail.com");
		 driver.findElement(By.name("q1")).sendKeys("test");
		 driver.findElement(By.id("q2")).sendKeys("test");
		 WebElement e1=driver.findElement(By.id("q2"));
		System.out.println(e1.getAttribute("value"));
		
		//Check box -Send To: *
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
	
		

	}

}
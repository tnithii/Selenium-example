package seleniumwebdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://amazon.com");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("house hold items");
	Thread.sleep(2000);
Actions act=new Actions(driver);

act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[1]/span/a/div/img")).click();
driver.findElement(By.cssSelector("body.a-m-us.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.biss_basic.en_US:nth-child(75) div.a-container:nth-child(8) div.centerColAlign.centerColAlign-bbcxoverride:nth-child(4) div.celwidget:nth-child(29) div.addTwisterMargin:nth-child(1) div.a-section form.a-spacing-small div.a-section.a-spacing-small:nth-child(2) ul.a-unordered-list.a-nostyle.a-button-list.a-declarative.a-button-toggle-group.a-horizontal.a-spacing-top-micro.swatches.swatchesSquare li.swatchAvailable span.a-list-item div.tooltip span.a-declarative span.a-button.a-button-thumbnail.a-button-toggle span.a-button-inner button.a-button-text div.twisterSwatchWrapper_0.twisterSwatchWrapper.thinWidthOverride div.twisterTextDiv.text > p.a-text-left.a-size-base")).click();
	}

}

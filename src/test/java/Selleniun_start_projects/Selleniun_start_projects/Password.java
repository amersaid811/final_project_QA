package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Password {
	
	 static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\HCnet\\git\\Selleniun_start_projects\\drivers\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
	 
	/*######################### Tests #########################*/
	 
	@Test
	public void Tests1() {
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("Ars123*");
		String currentPage=browser.getCurrentUrl();
        browser.findElement(By.cssSelector("input[type='button']")).click();
		String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);
    }
	
	@Test
	public void Tests2() {
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("Ars123++");
		String currentPage=browser.getCurrentUrl();
        browser.findElement(By.cssSelector("input[type='button']")).click();
        String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);;
			
			
    }
	
	


}

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

public class Triangle {
	
	 static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\HCnet\\git\\Selleniun_start_projects\\drivers\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
	 
	/*######################### Tests #########################*/
	 
	@Test
	public void Tests1() {
		
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("5");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		String currentPage=browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);
				
	}
	

    
	
	@Test
	public void Tests2() {
		
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("7");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("7");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		String currentPage=browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);
	}
	
	
	@Test
	public void Tests3() {
		
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("3");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("4");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		String currentPage=browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);
	}
	
	@Test
	public void Tests4() {
		
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("1");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("2");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		String currentPage=browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);
	}
	
	@Test
	public void Tests5() {
		
		WebElement textBox = browser.findElement(By.id("side1"));
		textBox.sendKeys("-3");
		textBox = browser.findElement(By.id("side2"));
		textBox.sendKeys("4");
		textBox = browser.findElement(By.id("side3"));
		textBox.sendKeys("5");
		String currentPage=browser.getCurrentUrl();
		browser.findElement(By.id("identify-triangle-action")).click();
		String newPage = browser.getCurrentUrl();
		assertNotEquals(currentPage, newPage);
	}
	
	


}

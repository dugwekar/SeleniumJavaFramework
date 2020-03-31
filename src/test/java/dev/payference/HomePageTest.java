package dev.payference;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.HomePageObjects;
import resources.Base;

public class HomePageTest extends Base {
	
	
	@Test
	public void homepageEvents() throws InterruptedException {
		
		HomePageObjects hm = new HomePageObjects(driver);
		hm.firstreport().click();
		Thread.sleep(4000);
		hm.past30days().click();
		Thread.sleep(8000);
		driver.navigate().to("https://dev.payference.com/payroll");
		Thread.sleep(5000);
		driver.navigate().to("https://dev.payference.com/payables");
		Thread.sleep(5000);	
		driver.navigate().to("https://dev.payference.com/receivables");
		Thread.sleep(5000);
		driver.navigate().to("https://dev.payference.com/vendors");
		Thread.sleep(5000);
		driver.navigate().to("https://dev.payference.com/customers");
		Thread.sleep(5000);
		driver.navigate().to("https://dev.payference.com/reports");
		Thread.sleep(5000);
	}
	
	@Test
	public void demo() throws InterruptedException {
		
		for(int i=0; i<=2; i++)
		{
			driver.findElement(By.id("swit")).click();
			Thread.sleep(3000);
		}
		
		
	}
	
	
	@AfterTest
	public void terminate() {
		driver.close();
		driver.quit();
		driver = null;
	}

}

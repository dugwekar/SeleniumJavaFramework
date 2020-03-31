package dev.payference;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;
import resources.Base;

public class LoginPageTest extends Base {
	

	@BeforeTest
	public void initialize() throws IOException {
		driver = invokeBrowser();
		driver.get(prop.getProperty("URL"));
	}
	
	
	@Test
	public void landingPageNav() throws IOException, InterruptedException {
		LoginPageObject lp = new LoginPageObject(driver);
		lp.username().sendKeys("vijay+dev1@payference.com");
		lp.pwd().sendKeys("temp1234");
		lp.login().click();
	}


}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPageObject {
	
	public WebDriver driver;
	
	
	By usrname = By.name("email");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@type='submit']");
	
	
	public LoginPageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public WebElement username()
	{
		return driver.findElement(usrname);
	}
	
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(loginBtn);
	}

}

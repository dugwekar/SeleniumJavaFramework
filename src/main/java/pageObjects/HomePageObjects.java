package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	WebDriver driver;

	By Firstreport = By.xpath("//div[@id='reportrange']");
	By Past30Days = By.xpath("//*[text()='Past 30 Days']");


	public HomePageObjects(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement firstreport() {

		return driver.findElement(Firstreport);
	}

	public WebElement past30days() {

		return driver.findElement(Past30Days);
	}


}

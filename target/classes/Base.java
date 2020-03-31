package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public WebDriver invokeBrowser() throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\libs\\Data.properties");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",".\\libs\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", ".\\libs\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Valid browser not selected");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
	}

	
	
public void getScreenshots(String result) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(".\\screenshots\\"+result+"pic.png"));
	
}
	
}

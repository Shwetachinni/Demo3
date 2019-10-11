package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Open_closeAppln implements constants{

	public WebDriver driver;
	static
	{
		System.setProperty(gecko_key, gecko_value);
	}
	
	@BeforeMethod
	public void open_Appln()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
	}
	
	@AfterMethod
	public void close_Appln()
	{
		driver.quit();
	}
}

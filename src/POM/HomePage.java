package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="(//a[contains(.,'Close')])[2]")
	private WebElement closepop;
	
	@FindBy(xpath="//ul[@class='topnav bodytext']//li/span")
	private List<WebElement> main;
	
	@FindBy(xpath="//ul[@class='topnav bodytext']/li//ul//a")
	private List<WebElement> sub;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickClose()
	{
		closepop.click();
	}
	
	public void mainmenu(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		for(WebElement we:main)
		{
			System.out.println(we.getText());
			act.moveToElement(we).perform();
			Thread.sleep(3000);
			int count = sub.size();
			System.out.println(count);
			for(WebElement we1:sub)
			{
				String txt = we1.getText();
				System.out.println(txt);
			}
		}
	}
}

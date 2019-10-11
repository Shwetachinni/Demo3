package Scripts;

import org.testng.annotations.Test;

import Generic.Open_closeAppln;
import POM.HomePage;

public class script1 extends Open_closeAppln{

	@Test
	public void TestScript() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickClose();
		hp.mainmenu(driver);
	}

}

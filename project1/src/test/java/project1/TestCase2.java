package project1;

//verify login is successful with correct username and pwd

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;

public class TestCase2 extends LaunchandQuit {

	@Test()
	public void login() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.hellosigin_hover(driver);
		h.sigin_click();
		LoginPage l = new LoginPage(driver);
		l.email_textfield();
		l.submit_button();
		l.password_Textfield();
		l.sigin1_button();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				"login failed");

	}
}

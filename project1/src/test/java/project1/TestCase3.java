package project1;
//ensure login fails with invalid un and pwd
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;

public class TestCase3 extends LaunchandQuit {
	@Test
	public void invalid_credentials() throws InterruptedException {

		HomePage h=new HomePage(driver);
		h.hellosigin_hover(driver);
		h.sigin_click();
		LoginPage l = new LoginPage(driver);
		l.email_invalid();
		l.submit_button();
		l.password_invalid();
		l.sigin1_button();
		//Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "failed");

	}
}

package project1;
//test if a new user can register successfully
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;
import amazonPages.RegistrationPage;

public class TestCase1 extends LaunchandQuit {
@Test()
public void registration()
{
	HomePage l=new HomePage(driver);
	l.hellosigin_hover(driver);
	l.newuserRegistration();
	RegistrationPage r=new RegistrationPage(driver);
	r.name_Textfield();
	r.mobilenumber_Textfieled();
	r.password_Textfield();
	r.verifymobilenumber_button();
	Assert.assertEquals(driver.getTitle(),"Authentication required","Registration failed");
}
}

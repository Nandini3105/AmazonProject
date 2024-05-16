package project1;


import org.testng.annotations.Test;

import amazonPages.EditProfilePage;
import amazonPages.HomePage;
import amazonPages.LoginPage;

//if user can successfully edit profile information
public class TestCase4 extends LaunchandQuit{
@Test()
public void editprofile() throws InterruptedException
{
	HomePage h=new HomePage(driver);
	h.hellosigin_hover(driver);
	h.sigin_click();
	LoginPage l=new LoginPage(driver);
	l.email_textfield();
	l.submit_button();
	l.password_Textfield();
	l.sigin1_button();
	Thread.sleep(3000);
	EditProfilePage e=new EditProfilePage(driver);
	e.account_hover(driver);
	e.manageaccount_click();
	Thread.sleep(2000);
	e.viewaccount_click();
	e.editpreferredepartment();
	e.clickonaddbutton();
	e.selectwomen();
	//e.clickonsavebutton();
}
}

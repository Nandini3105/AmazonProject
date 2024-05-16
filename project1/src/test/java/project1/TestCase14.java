package project1;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;
import amazonPages.OrdersPage;

//go to orders page and click on your last ordered product and give 5 star rating
public class TestCase14 extends LaunchandQuit {
@Test()
public void productreview()
{
	HomePage h=new HomePage(driver);
	
	h.hellosigin_hover(driver);
	h.sigin_click();
	LoginPage l=new LoginPage(driver);
	l.email_textfield();
	l.submit_button();
	l.password_Textfield();
	l.sigin1_button();
	OrdersPage o=new OrdersPage(driver);
	o.orders();
	o.writeproductreview();
	o.submitbutton();
	Assert.assertEquals(driver.getTitle(),"Review Your Purchases","review failed");
}
}

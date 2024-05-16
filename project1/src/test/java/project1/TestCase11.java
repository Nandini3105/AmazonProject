package project1;
//validate entire process like address selection,payment selection and order review

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;
import amazonPages.ProductCheckoutPage;
import amazonPages.ShoppingCartPage;

public class TestCase11 extends LaunchandQuit {
@Test()
public void validate_checkout() throws InterruptedException
{
	HomePage h=new HomePage(driver);
	h.hellosigin_hover(driver);
	h.sigin_click();
	LoginPage l=new LoginPage(driver);
	l.email_textfield();
	l.submit_button();
	l.password_Textfield();
	l.sigin1_button();
	ShoppingCartPage s=new ShoppingCartPage(driver);
	s.clinkoncarticon();
	s.proceedtobuy_click();
	ProductCheckoutPage p=new ProductCheckoutPage(driver);
	p.adddeliveryaddress();
	p.selectcod();
	p.usepaymentmethod();
	
	//p.reviewyourorder();
}
}

package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;
import amazonPages.ProductCheckoutPage;
import amazonPages.ShoppingCartPage;

//check if user able to select each payment methods
public class TestCase12 extends LaunchandQuit {
@Test
public void selectpaymentmethod() throws InterruptedException
{
	HomePage h=new HomePage(driver);
	h.hellosigin_hover(driver);
	h.sigin_click();
	LoginPage l=new LoginPage(driver);
	l.email_textfield();
	l.submit_button();
	l.password_Textfield();
	l.sigin1_button();
	ShoppingCartPage s =new ShoppingCartPage(driver);
	s.clinkoncarticon();
	s.proceedtobuy_click();
	ProductCheckoutPage p=new ProductCheckoutPage(driver);
	p.adddeliveryaddress();
	p.selectcreditordebit_radiobutton(driver);
	p.selectnetbanking_radiobutton();
	p.selectotherupi();
	p.selectemi();
	p.selectcod();
	
}
}

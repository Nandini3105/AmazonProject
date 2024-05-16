package project1;
//check if user able to apply cupon code
import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;
import amazonPages.ProductCheckoutPage;
import amazonPages.ShoppingCartPage;

public class TestCase13 extends LaunchandQuit{
@Test()
public void cuponcode() throws InterruptedException {
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
	//p.changepaymentmethod();
	//p.selectcod();
	p.usepaymentmethod();
	p.applycuponcode();
	//p.apply_button();
}
}

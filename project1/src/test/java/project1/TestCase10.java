package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.LoginPage;
import amazonPages.ProductSearchResultPage;
import amazonPages.ShoppingCartPage;

//update item quantity and remove items from cart
public class TestCase10 extends LaunchandQuit {
	@Test()
	public void updateandremovecart() throws InterruptedException {
		HomePage h = new HomePage(driver);
		h.hellosigin_hover(driver);
		h.sigin_click();
		LoginPage l= new LoginPage(driver);
		l.email_textfield();
		l.submit_button();
		l.password_Textfield();
		l.sigin1_button();

		h.searchbox_Textfield();
		ProductSearchResultPage p = new ProductSearchResultPage(driver);
		p.clickonfirst_product();
		ShoppingCartPage s = new ShoppingCartPage(driver);
		s.clickonaddtocart(driver);
		s.clinkoncarticon();
		s.updatecartvalue();
		s.deletefromcart();
	}
}

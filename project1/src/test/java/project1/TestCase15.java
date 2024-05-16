package project1;
//reach till cart page without login to amazon

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.ProductSearchResultPage;
import amazonPages.ShoppingCartPage;

public class TestCase15 extends LaunchandQuit{
@Test()
public void cartpagewithoutlogin() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.searchbox_Textfield();
		ProductSearchResultPage p=new ProductSearchResultPage(driver);
		p.clickonfirst_product();
	   ShoppingCartPage s=new ShoppingCartPage(driver);
	   s.clickonaddtocart(driver);
	   Assert.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart","testcase failed");
		
	}


}

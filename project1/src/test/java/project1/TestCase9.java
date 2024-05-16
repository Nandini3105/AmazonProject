package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.ProductSearchResultPage;
import amazonPages.ShoppingCartPage;

//verify the product can be added to shopping cart from product page
public class TestCase9 extends LaunchandQuit {
@Test
public void addtoshoppingcart() throws InterruptedException {
HomePage h=new HomePage(driver);
h.searchbox_Textfield();
ProductSearchResultPage p=new ProductSearchResultPage(driver);
p.clickonfirst_product();
ShoppingCartPage s=new ShoppingCartPage(driver);
s.clickonaddtocart(driver);

}
}

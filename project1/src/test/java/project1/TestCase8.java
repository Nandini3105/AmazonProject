package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.ProductSearchResultPage;
//check if a product can be sorted by relevance,price and rating
public class TestCase8 extends LaunchandQuit {
@Test()
public void filterproduct()
{
	HomePage h=new HomePage(driver);
	h.searchbox_Textfield();
	ProductSearchResultPage p=new ProductSearchResultPage(driver);
	//p.pricefilter_click();
	p.customerreview_click();
	
}
}

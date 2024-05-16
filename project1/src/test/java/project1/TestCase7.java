package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.ProductSearchResultPage;

//ensure product details page ensure all necessary information
//price ,reviews,description
public class TestCase7 extends LaunchandQuit {
@Test()
public void productdetailspage()
{
	HomePage h=new HomePage(driver);
	h.searchbox_Textfield();
	ProductSearchResultPage p=new ProductSearchResultPage(driver);
	//p.pricefilter_click();
	p.customerreview_click();
	
}
}

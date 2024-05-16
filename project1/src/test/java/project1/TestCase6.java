package project1;

import org.testng.annotations.Test;

import amazonPages.HomePage;
import amazonPages.ProductSearchResultPage;

//verify that searching with filters (category,price) yields accurate results
public class TestCase6 extends LaunchandQuit {
	@Test()
	public void search_by_filter() throws InterruptedException {
	HomePage h=new HomePage(driver);
    h.searchbox_Textfield();
    ProductSearchResultPage s=new ProductSearchResultPage(driver);
    s.categoryfilter_click();
    Thread.sleep(2000);
    //s.pricefilter_click();
}
}

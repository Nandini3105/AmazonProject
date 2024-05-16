package amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchResultPage {
@FindBy(linkText="Men's Running Shoes")WebElement categoryfilter;
@FindBy(linkText="₹500 - ₹1,000")WebElement pricefilter;
@FindBy(xpath="//i[.='4 Stars & Up']")WebElement customerreview;
@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")WebElement clikonproduct;


public void categoryfilter_click()
{
	categoryfilter.click();
}
public void pricefilter_click()
{
	if(pricefilter.isDisplayed()==true)
	{
	pricefilter.click();
	}
}
public void customerreview_click()
{
	if(customerreview.isDisplayed()==true)
	{
		customerreview.click();
	}
}
public void clickonfirst_product() {
	clikonproduct.click();
}
public ProductSearchResultPage(ChromeDriver driver)
{
	PageFactory.initElements(driver,this);
}
}

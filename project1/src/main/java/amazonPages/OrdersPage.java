package amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
@FindBy(id="nav-orders")WebElement orders;
@FindBy(id="Write-a-product-review_2")WebElement producterview;
@FindBy(xpath="//img[@alt='select to rate item five star.']")WebElement fivestar;
@FindBy(xpath="//span[.='Submit']")WebElement submitbutton;
public void orders()
{
	orders.click();
}
public void writeproductreview()
{
	producterview.click();
}
public void givefivestarrating()
{
	fivestar.click();
}
public void submitbutton()
{
	submitbutton.click();
}
public OrdersPage(ChromeDriver driver) 
{
	PageFactory.initElements(driver,this);
}
}

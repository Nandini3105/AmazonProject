package amazonPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage  {
@FindBy(id="add-to-cart-button")WebElement addtocart_button;
@FindBy(id="nav-cart-count")WebElement carticon;
@FindBy(name="quantity")WebElement updatecart;
@FindBy(xpath="//input[@value='Delete']")WebElement deletecart;
@FindBy(name="proceedToRetailCheckout")WebElement proceedtobuy;

 
public void clickonaddtocart(ChromeDriver driver) throws InterruptedException
{
	Set<String> wh=driver.getWindowHandles();
	Iterator<String> i=wh.iterator();
	String parent=i.next();
	String child=i.next();
	driver.switchTo().window(child);
	Thread.sleep(2000);
	addtocart_button.click();
}
public void clinkoncarticon()
{
	carticon.click();
}
public void updatecartvalue()
{
	Select s=new Select(updatecart);
	s.selectByVisibleText("2");
}
public void deletefromcart() throws InterruptedException
{
	Thread.sleep(2000);
	deletecart.click();
}
public void proceedtobuy_click()
{
	proceedtobuy.click();
}

public ShoppingCartPage(ChromeDriver driver)
{
	PageFactory.initElements(driver,this);
}

}

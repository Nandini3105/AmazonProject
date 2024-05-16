package amazonPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="twotabsearchtextbox") WebElement searchbox;
@FindBy(xpath="//div[.='Hello, sign in']")WebElement hellosigin;
@FindBy(linkText="Start here.")WebElement newuser;
@FindBy(linkText="Sign in")WebElement sigin;
public void hellosigin_hover(ChromeDriver driver) 
{
	//Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.moveToElement(hellosigin).perform();
	
}
public void newuserRegistration()
{
	newuser.click();
}
public void sigin_click()
{
	sigin.click();
}
public void searchbox_Textfield()
{
	searchbox.sendKeys("shoe");
	searchbox.sendKeys(Keys.ENTER);
}

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

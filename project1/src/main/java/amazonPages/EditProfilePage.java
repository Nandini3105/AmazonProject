
package amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage {
@FindBy(id="nav-link-accountList-nav-line-1")WebElement Accounthover;
@FindBy(xpath="//div[.='Manage Profiles']")WebElement manageaccount;
@FindBy(xpath="//div[.='View']")WebElement viewaccount;
@FindBy(xpath="//div[.='Preferred department']")WebElement preferreddepartment;
@FindBy(xpath="//button[.='Add']")WebElement addbutton;
@FindBy(xpath="//button[.='Women']")WebElement women;
@FindBy(xpath="//span[.='Save']")WebElement save;


public void account_hover(ChromeDriver driver)
{
	Actions a=new Actions(driver);
	a.moveToElement(Accounthover).perform();
}
public void manageaccount_click() throws InterruptedException
{
	Thread.sleep(2000);
	manageaccount.click();
}
public void viewaccount_click()
{
	viewaccount.click();
}
public void editpreferredepartment()
{
	preferreddepartment.click();
}
public void selectwomen() throws InterruptedException
{
	Thread.sleep(2000);
	women.click();
}
public void clickonaddbutton() throws InterruptedException
{
	Thread.sleep(4000);
	addbutton.click();
}
public void clickonsavebutton()
{
	save.click();
}
public EditProfilePage(ChromeDriver driver)
{
	PageFactory.initElements(driver,this);
}

}

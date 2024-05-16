package amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
@FindBy(name="customerName")WebElement name;
@FindBy(id="ap_phone_number")WebElement mobilenumber;
@FindBy(id="ap_password")WebElement password;
@FindBy(id="continue")WebElement verifymobilenumber;
public void name_Textfield()
{
	name.sendKeys("aswatha");
}
public void mobilenumber_Textfieled()
{
	mobilenumber.sendKeys("7530015658");
}
public void password_Textfield()
{
	password.sendKeys("nand45321@1");
}
public void verifymobilenumber_button()
{
	verifymobilenumber.click();
}
public RegistrationPage(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

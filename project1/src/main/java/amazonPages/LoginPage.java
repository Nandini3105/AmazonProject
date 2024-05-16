package amazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//ChromeDriver driver;
@FindBy(id="ap_email")WebElement email;
@FindBy(id="continue")WebElement submit;
@FindBy(id="ap_password")WebElement password;
@FindBy(id="signInSubmit")WebElement sigin1;


public void email_textfield()
{
	email.sendKeys("nandycse31@gmail.com");
}
public void submit_button()
{
	submit.click();
}
public void password_Textfield()
{
	password.sendKeys("Nandy@315");
}
public void sigin1_button()
{
	sigin1.click();
}
public void email_invalid()
{
	email.sendKeys("abc@gmail.com");
}
public void password_invalid()
{
	password.sendKeys("ndnfdifw");
}
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}



}

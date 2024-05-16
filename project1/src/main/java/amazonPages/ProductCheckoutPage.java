package amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductCheckoutPage {
@FindBy(name="placeYourOrder1")WebElement placeyourorder;
@FindBy(id="addressChangeLinkId")WebElement addressupdate;
@FindBy(xpath="(//input[@type='radio'])[1]")WebElement selectfirstaddress;
@FindBy(id="shipToThisAddressButton")WebElement usetheaddress;
@FindBy(id="payChangeButtonId")WebElement changepayment;
@FindBy(xpath="//input[@value='SelectableAddCreditCard']")WebElement creditcard_radiobutton;
@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")WebElement netbanking_radiobutton;
@FindBy(name="ppw-bankSelection_dropdown")WebElement bankdropdown;
@FindBy(xpath="//div[@aria-label='Other UPI Apps']")WebElement otherupi;
@FindBy(xpath="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']")WebElement emi;
@FindBy(xpath="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']")WebElement cod;
@FindBy(id="spc-gcpromoinput")WebElement cuponcode;
@FindBy(id="orderSummaryPrimaryActionBtn")WebElement usepayment;
@FindBy(id="spcViewButtonId-announce")WebElement revieworder;
@FindBy(id="gcApplyButtonId")WebElement applybutton;
public void placeyourorder_click() {
	placeyourorder.click();
}
public void adddeliveryaddress() throws InterruptedException {
	//addressupdate.click();
	Thread.sleep(4000);
	selectfirstaddress.click();
	Thread.sleep(4000);
	usetheaddress.click();
}
public void changepaymentmethod() throws InterruptedException
{
	Thread.sleep(9000);
	changepayment.click();
}
public void selectcreditordebit_radiobutton(ChromeDriver driver) throws InterruptedException
{
	//driver.switchTo().frame(0);
	Thread.sleep(3000);
	//if(creditcard_radiobutton.isSelected()==false)
	//{
		creditcard_radiobutton.click();
	//}
}
public void selectnetbanking_radiobutton()
{
	netbanking_radiobutton.click();
	Select s=new Select(bankdropdown);
	s.selectByVisibleText("ICICI Bank");
	
}
public void selectotherupi()
{
	otherupi.click();
}
public void selectcod() throws InterruptedException
{
	Thread.sleep(2000);
	cod.click();
}
public void selectemi() 
{
	emi.click();
}
public void usepaymentmethod() throws InterruptedException
{
	Thread.sleep(5000);
	usepayment.click();
}
public void reviewyourorder()
{
	revieworder.click();
}
public void applycuponcode() throws InterruptedException
{
	cuponcode.sendKeys("Bdgh123");
	//Thread.sleep(2000);
}
public void apply_button() throws InterruptedException
{
	//Thread.sleep(8000);
	applybutton.click();
}
public ProductCheckoutPage(ChromeDriver driver)
{
	PageFactory.initElements(driver,this);
}
}

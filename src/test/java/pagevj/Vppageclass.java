package pagevj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vppageclass {
WebDriver driver;
@FindBy(xpath="//*[@id=\"username\"]")
WebElement emailid;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement password1;
@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button") 
WebElement button;
@FindBy(xpath="//*[@id=\"menu-item-10534\"]/a")
WebElement home;
@FindBy(xpath="//*[@id=\"post-212\"]/div/div[2]/div/div/div/div[3]/div/div/ul/li[1]/div/div/div[2]/a/h3")
WebElement mangoproduct;
@FindBy(xpath="//*[@id=\"product-10858\"]/div[2]/form/div/div[2]/div/input[2]")
WebElement qtybutton;
@FindBy(xpath="//*[@id=\"pa_weignt\"]")
WebElement weight;
@FindBy(xpath="//*[@id=\"pa_weignt\"]/option[2]")
WebElement kg;
@FindBy(xpath="//*[@id=\"product-10858\"]/div[2]/form/div/div[2]/button")
WebElement addcart;
@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/a")
WebElement viewcart;
@FindBy(xpath="//*[@id=\"post-2390\"]/div/div[1]/div[2]/div/div/a")
WebElement checkout;
@FindBy(xpath="//*[@id=\"billing_first_name\"]")
WebElement fname;
@FindBy(xpath="//*[@id=\"billing_last_name\"]")
WebElement lname;
@FindBy(xpath="//*[@id=\"billing_company\"]")
WebElement coname;
@FindBy(xpath="//*[@id=\"billing_address_1\"]")
WebElement streetaddress;
@FindBy(xpath="//*[@id=\"billing_address_2\"]")
WebElement appartment;
@FindBy(xpath="//*[@id=\"billing_city\"]")
WebElement city;
@FindBy(xpath="//*[@id=\"select2-billing_state-container\"]")
WebElement state;
@FindBy(xpath="//*[@id=\"billing_postcode\"]")
WebElement pincode;
@FindBy(xpath="//*[@id=\"billing_phone\"]")
WebElement phonenumber;
@FindBy(xpath="//*[@id=\"menu-item-10534\"]/a")
WebElement backtohome;
@FindBy(xpath="//*[@id=\"woocommerce-product-search-field-0\"]")
WebElement searchbox;
@FindBy(xpath="//*[@id=\"masthead\"]/div/div[2]/div/div/div[3]/form/button")
WebElement searchbotton;
@FindBy(xpath="//*[@id=\"product-11161\"]/div[2]/h1")
WebElement titlesambarpowder;



public Vppageclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void setvalues(String uname,String pass) throws Exception
{
	Thread.sleep(2000);
	emailid.sendKeys(uname);
	password1.sendKeys(pass);
}
public void login()
{
	button.click();
}
public void hometocart() throws Exception
{
	//Thread.sleep(2000);
	home.click();
	mangoproduct.click();
	qtybutton.clear();
}
public void setvalues1(String qtty) throws Exception
{
	//Thread.sleep(2000);
	qtybutton.sendKeys(qtty);
}
public void cartprocedure() throws Exception
{
	//Thread.sleep(2000);
	weight.click();
	kg.click();
	addcart.click();
	viewcart.click();
	checkout.click();
}

public void setvalues2(String fn,String ln,String cn,String strr,String appt,String cty,String pin,String phno) throws Exception
{
	//Thread.sleep(2000);
	fname.sendKeys(fn);
	lname.sendKeys(ln);
	coname.sendKeys(cn);
	streetaddress.sendKeys(strr);
	appartment.sendKeys(appt);
	city.sendKeys(cty);
	
	state.click();
	pincode.sendKeys(pin);
	phonenumber.sendKeys(phno);
    driver.navigate().refresh();
	backtohome.click();
}


public void setvalues3(String item)
{

	searchbox.sendKeys(item);
	searchbotton.click();
	
	
}
public void gettitle()
{
	String title=driver.getPageSource();
	if(title.contains("SAMBAR POWDER"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}




}

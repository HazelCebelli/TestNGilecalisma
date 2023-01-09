package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroWebAppPage {

    public ZeroWebAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="signin_button")
    public WebElement signInButonu;

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButonu;

    @FindBy(xpath = "//strong[.='Online Banking']")
    public  WebElement onlineBanking;

    @FindBy(id = "pay_bills_link")
    public  WebElement payBills;

    @FindBy(linkText = "Purchase Foreign Currency")
    public WebElement purchaseForeinCurrency;

    @FindBy(id = "pc_currency")
    public  WebElement currencyDropDwon;


}

package tests.day15;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroWebAppPage;
import utilities.Driver;

public class C02 {
    @Test
    public void test01(){
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get("http://zero.webappsecurity.com/");
        // 2. Sign in butonuna basin
        ZeroWebAppPage zeroWebAppPage=new ZeroWebAppPage();
        zeroWebAppPage.signInButonu.click();

        // 3. Login kutusuna “username” yazin
        zeroWebAppPage.username.sendKeys("username");

        // 4. Password kutusuna “password” yazin
        zeroWebAppPage.password.sendKeys("password");

        // 5. Sign in tusuna basin
        zeroWebAppPage.submitButonu.click();

        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();
        zeroWebAppPage.onlineBanking.click();
        zeroWebAppPage.payBills.click();

        // 7. “Purchase Foreign Currency” tusuna basin
        zeroWebAppPage.purchaseForeinCurrency.click();

        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select select=new Select(zeroWebAppPage.currencyDropDwon);
        select.selectByVisibleText("Eurozone (euro)");

        // 9. soft assert kullanarak “Eurozone (euro)” secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(select.getFirstSelectedOption().getText().trim().equals("Eurozone (euro)"));

        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin “Select One”,
        // “Australia (dollar)“, “Canada (dollar)“,”Switzerland (franc)“,”China (yuan)“,”Denmark (krone)“,”Eurozone
        // (euro)“,”Great Britain (pound)“,”Hong Kong (dollar)“,”Japan (yen)“,”Mexico (peso)“,”Norway (krone)“,”New
        // Zealand (dollar)“,”Sweden (krona)“,”Singapore (dollar)“,”Thailand (baht)”

        Driver.quitDriver();
       softAssert.assertAll();  //UNUTMAAAA!!!
    }
}

package tests.day18_HTML_Report;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C02_DataProvider {

    @DataProvider
    public static Object[][] AmazonAranacakKelimeler() {
        /*
        @DataProvider istedigimiz test methoduna test datasi saglamak icin kullanilir.
        Sadece 1 sarti vardir.  2 Katli bir object arrayi dondurmelidir.
         */
        Object [] [] amazonAranacakKelimeArrayi={{"Nutella"},{"Java"},{"Apple"},{"Samsung"},{"Armut"}};
        return amazonAranacakKelimeArrayi;
    }

    @Test(dataProvider = "AmazonAranacakKelimeler")
    public void aramaTesti(String aranacakKeleime){

    //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com/");

    // Nutella , Java, apple, samsung, armut kelimlerini aratın
    AmazonPage amazonPage=new AmazonPage();
   amazonPage.amazonAramaKutusu.sendKeys(aranacakKeleime+Keys.ENTER);


    //arama sonuclarının aranacakKelimeyi içerdiğini doğrulayın

        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText().trim();

        



}}

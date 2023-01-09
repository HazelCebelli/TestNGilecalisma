package tests.day18_HTML_Report;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTML_Reports  extends TestBaseRapor{

@Test
    public void test01(){

    extentTest=extentReports.createTest("Nutella testi", "kullanici Amazonda Nutella arayabilmeli");
    //amazon anasayfaya gidin
    Driver.getDriver().get("https://www.amazon.com/");
    extentTest.info("amazon anasayfaya gidildi");

    //nutella icin arama yapin
    AmazonPage amazonPage=new AmazonPage();
    amazonPage.amazonAramaKutusu.sendKeys("nutella"+Keys.ENTER);
    extentTest.info("aram akutusuna Nutella yazip arama yapildi");

    //sonuclarin nutella icerdigini test edin
    String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText().trim();
    String expectedKelime="Nutella";
    extentTest.info("Arama sonuclari kaydedildi");

    Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
    extentTest.pass("Arama sonuclarinin Nutella icerdigi test edildi");



}
}

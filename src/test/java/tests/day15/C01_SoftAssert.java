package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C01_SoftAssert {
    @Test
    public void test01(){

        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com/");

        // amazon anasayfaya gittiğinizi doğrulayın
        SoftAssert softAssert=new SoftAssert();
        String expectedURLKelime="amazon";
        String actualURL=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualURL.contains(expectedURLKelime));

        // Nutella aratın
        AmazonPage amazonpage=new AmazonPage();
        amazonpage.amazonAramaKutusu.sendKeys("Nutella"+Keys.ENTER);

        //arama sonuclarının nutella içerdiğini doğrulayın

//        String aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
//        softAsset.assertTrue(aramaSonucYazisi.contains("Nutella"),"Arama sonucu Nutella içermiyor");
//        //Java aratın
//        amazonPage.amazonAramaKutusu.clear();
//        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);
//        //arama sonuclarının 1000'den fazla oldugunu dogrulayın
//        System.out.println(amazonPage.aramaSonucuElementi.getText());
//        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
//        String[] sonucArr=aramaSonucYazisi.split(" ");
//        System.out.println(Arrays.toString(sonucArr));
//        String javaSonucSayisiStr=sonucArr[3];
//        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");//6000
//        int sonucSayisiInt=Integer.parseInt(javaSonucSayisiStr);
//        softAsset.assertTrue(sonucSayisiInt>1000,"Arama sonucu 1000'den çok değil");


        softAssert.assertAll();
        Driver.closeDriver();




    }
}

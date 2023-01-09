package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;

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
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+Keys.ENTER);


        //arama sonuclarının nutella içerdiğini doğrulayın

        String aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText().trim();

        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"),"Arama sonucu Nutella içermiyor");

        //Java aratın
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);

        ReusableMethods.bekle(3);


        //arama sonuclarının 1000'den fazla oldugunu dogrulayın
        System.out.println(amazonPage.aramaSonucuElementi.getText());  //1-48 of over 7,000 results for "Java"

        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();   //1-48 of over 7,000 results for "Java"

        String[] sonucArr=aramaSonucYazisi.split(" ");

        System.out.println(Arrays.toString(sonucArr));   //[1-48, of, over, 7,000, results, for, "Java"]
        //We need to take 3rd index to get the number 7000
        String javaSonucSayisiStr=sonucArr[3];  //7000

        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");     //7000   ve su an bu String

        int sonucSayisiInt=Integer.parseInt(javaSonucSayisiStr);   // boylece sonuc sayisini Int yaptik

        softAssert.assertTrue(sonucSayisiInt>1000,"Arama sonucu 1000'den çok değil");


        softAssert.assertAll();
        //Driver.closeDriver();




    }
}

package tests.day18_HTML_Report;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NegativeLogintesti {

    @Test(dataProvider = "QualityDemyranacakKelimeler")
    public void negativeLoginTest(String username, String Password) {

        //Qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");

        //verilen yanlis kullanici adi ve password kombinasyonlari icin
        //giris yapilamadigini test edin
        //username  password
        //A11       A12345
        //B12       B12345
        //C13       C12345
        //D14       D12345
        //E15       E12345

        /*
        WebElement cookieKabul = Driver.getDriver().findElement(By.xpath("//*[text()='Accept']"));
cookieKabul.click();

 if (qualitydemyPage.cookiesAccept.isDisplayed()){
            qualitydemyPage.cookiesAccept.click();
        }
         */
    }

}

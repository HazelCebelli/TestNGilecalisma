package tests.day19_CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class C01_AmazonCrossBrowser extends TestBaseCross {

    @Test
    public void test01(){

        //amazon anasayfaya gidin
        driver.get(ConfigReader.getProperty("amazonUrl"));

        //nutella icin arama yapin
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuclarin nutella icerdigini test edin
        WebElement aramaSonucElemneti=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedKelime="Nutella";
        String acxtualKelime=aramaSonucElemneti.getText().trim();
        Assert.assertTrue(acxtualKelime.contains(expectedKelime));


    }
}

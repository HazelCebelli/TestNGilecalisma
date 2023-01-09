package tests.day16_SmokeTest;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PozitiveLoginTest {

    @Test
    public void positiveLoginTest(){

        //qualitydemy anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        ReusableMethods.bekle(5);
        Driver.closeDriver();

      /*  @FindBy(xpath = "//*[text()='Accept']")
        public WebElement cookiesAccept; */

    }


}

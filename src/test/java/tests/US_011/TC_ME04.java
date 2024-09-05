package tests.US_011;

import org.bouncycastle.pqc.crypto.util.PQCOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class TC_ME04 {

    @Test
    public  void contactadresidogrulugutesti(){
        HomePage homePage=new HomePage();

        //Ziyaretçi HauseHeaven url girer.
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

       // Ziyaretçi HauseHeaven anasayfa header a ulaşır.
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

       // Ziyaretçi Contact linkine tıklar.
        homePage.contactlinkibutonu.click();

      //  Ziyaretçi Contact sayfasına ulaşır.
        ReusableMethods.hover(homePage.contactdırections);
      // Ziyaretçi sayfada Reach Us kısmındaki adresi görür.

        Assert.assertTrue(homePage.contactreachuselementi.isDisplayed());
        // Ziyaretçi adres dogrulamak için Directions kısmındaki harita alanından scrool yaparak Reach Us kısmındaki adresin aynı olduğunu dogrular.



        //Ziyaretçi açılan sekmeyi kapatır.
        Driver.getDriver().quit();


    }
}

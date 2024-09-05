package tests.US_011;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_ME01  {

    @Test
    public  void contactsayfasiTesti(){

        HomePage homePage=new HomePage();
       // extentTest =extentReports.createTest("Contact sayfası tıklandığında iletişim bilgilerinin görünür olduğu testi");

       // Ziyaretçi HauseHeaven url girer.
      Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        // Ziyaretçi HauseHeaven anasayfa header a ulaşır.
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

       // Ziyaretçi Contact linkine tıklar
        homePage.contactlinkibutonu.click();

        // Ziyaretçi Contact sayfasına ulaşır.
        Assert.assertTrue(homePage.contactgetıntuchelementı.isDisplayed());

        // Ziyaretçi Contact sayfasının header kısmını görür.
       ReusableMethods.hover(homePage.contactdırections);

       // Ziyaretçi Contact sayfasında get in touch kısmında adres,email ve phonekısımlarını görerek iletişim bilgilerinin görünür olduğunu doğrular
        Assert.assertTrue(homePage.contactnamekutusuElementi.isDisplayed());
        Assert.assertTrue(homePage.contactemailkutusElementi.isDisplayed());
        Assert.assertTrue(homePage.contactphonekutusuElementi.isDisplayed());
        Assert.assertTrue(homePage.contactsubjectkutusuElementi.isDisplayed());
        Assert.assertTrue(homePage.contactmesajkutusuElementi.isDisplayed());


      // Ziyaretçi sekmeyi kapatır.

        Driver.getDriver().quit();


    }
}

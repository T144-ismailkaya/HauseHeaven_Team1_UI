package tests.US_011;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_ME03  {

    @Test
    public void mesajgöndermenegatiftesti(){

        HomePage homePage=new HomePage();
       // extentTest =extentReports.createTest("Mesaj gönderme formunda zorunlu alanlardan en az biri bos bırakıldığında yada yanlış giriş yapıldığında uyarı mesajının görüntülenmesi testi");

       // Ziyaretçi HauseHeaven url girer.
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        // Ziyaretçi HauseHeaven anasayfa header a ulaşır.
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

        // Ziyaretçi Contact linkine tıklar.
        homePage.contactlinkibutonu.click();

        // Ziyaretçi Contact sayfasına ulaşır.
        ReusableMethods.hover(homePage.contactdırections);
        Assert.assertTrue(homePage.contactgetıntuchelementı.isDisplayed());

        // Ziyaretçi mesaj gönderebilmek için sadece name kutusuna isim , mesaj kuttusuna mesajını yazar ve emal kısmını yanlış girerek send messaje butonuna tıklar
       homePage.contactnamekutusuElementi.sendKeys("sevde");
       homePage.contactemailkutusElementi.sendKeys("sevde.com");
       homePage.contactmesajkutusuElementi.sendKeys("ilanınız hakkında bilgi almak istiyorum");

        homePage.contactsendmeesagebutonu.click();
        ReusableMethods.bekle(10);
        //Ziyaretçi The email address is not valid penseresini gordüğünde mesajın gonderilemediğini doğrular

        Assert.assertTrue(homePage.contactmessageerror.isDisplayed());

        //Ziyaretçi açılan sekmeyi kapatır.

        Driver.getDriver().quit();


    }

}

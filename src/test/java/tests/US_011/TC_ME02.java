package tests.US_011;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_ME02  {

    @Test
    public void mesajgönderebilmeTesti(){

        HomePage homePage=new HomePage();
       // extentTest =extentReports.createTest("Mesaj gönderebilmek için gereklı alanları doldurup mesaj göndermenin başarılı oldugu testi.");

       // Ziyaretçi HauseHeaven url girer.

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
       // Ziyaretçi HauseHeaven anasayfa header a ulaşır.
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

        //Ziyaretçi Contact likine tıklar .
        homePage.contactlinkibutonu.click();

        //Ziyaretçi Contact sayfasına ulaşır.
        ReusableMethods.hover(homePage.contactdırections);
        // Ziyaretçi mesaj gönderebilmek için name kutusuna isim ,subject kutusuna soyisim , email kutusuna email,phone kutusuna telefon numarası ve mesaj alanına göndermek istediği mesajı girer.
       homePage.contactnamekutusuElementi.sendKeys("elif");
       homePage.contactemailkutusElementi.sendKeys("elif@gmail.com");
       homePage.contactphonekutusuElementi.sendKeys("05554443322");
       homePage.contactsubjectkutusuElementi.sendKeys("demir");
        homePage.contactmesajkutusuElementi.sendKeys("ilanınız hakkında bilgi almak istiyorum");
       // Ziyaretçi mesajı göndermek için send message butonuna tıklar.
        homePage.contactsendmeesagebutonu.click();
        ReusableMethods.bekle(10);

       // ziyaretçi "send mesaage succezfully" penceresini görmesiyle mesajının gönderildiğini doğrular.
        Assert.assertTrue(homePage.contactmessagesuccessfully.isDisplayed());

        // Ziyaretçi açilan sekmeyi kapatır.
        Driver.getDriver().quit();

    }

}

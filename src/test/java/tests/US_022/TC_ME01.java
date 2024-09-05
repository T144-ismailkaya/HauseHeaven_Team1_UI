package tests.US_022;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_ME01 {
    @Test
    public void mülküwishlisteekleyebıldiğitsti(){
        HomePage homePage=new HomePage();

       // Kayıtlı kullancı HauseHeaven url girer.
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        // Kayıtlı kullanıcı HauseHeaven anasayfa header a ulaşır.
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

       //Kayıtlı kullanıcı listing linkine tıklar.
        homePage.listingButonu.click();

        // Kayıtlı kullanıcı listing sayfasına ulaşır.


       // Kayıtlı kullanıcı sayfada seçtiği mülk reminin sağ üst köşesindeki wishlist butonuna tıklar.
       // homePage.listingwishlistbutonu.click();

       // Kayıtlı kullanıcı "added to wishlist succesfully" penceresini görerek mülkü wishlist e ekleyebildiğini doğrular.
        // Kayıtlı kullanıcı acilan sekmeyi kapatır.

    }
}

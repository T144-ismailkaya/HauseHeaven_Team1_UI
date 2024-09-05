package tests.US_005;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

public class TC_L020SubscribeBox {

    @Test

    public void TC020Subscribe() {
        HomePage homePage = new HomePage();
        Faker faker = new Faker();
        //Ziyaretci hausehaen Url'ine giris saglar ve footer bolumune scroll yapar
        LeventMethods.footerhomepageScroll();
        //Ziyaretci anasayfa footer bolumunde yer alan   istedigi gecerli email adresini "Subscribe"box'in icine girer
        homePage.sefFooterSubscribeBox.sendKeys(faker.internet().emailAddress());
        //Ziyaretci anasayfa footer bolumunde yer alan subsribe buttonu tiklar
        homePage.getSefFooterSubscribeBoxButtonElementi.click();
        //Ziyaretci "Email adresinin basarali sekilde kaydedilgini dogrular"
         ReusableMethods.waitForVisibility(homePage.seffooterSubscribeConfirmYaziElementi,10);
        //Ziyratci tarayiciyi kapatir

    }
}
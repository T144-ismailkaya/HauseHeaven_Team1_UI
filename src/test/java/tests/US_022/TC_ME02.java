package tests.US_022;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Random;

public class TC_ME02 extends TestBaseRapor {

    @Test
    public void test02(){

        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest(" listingde mulk detaylarin aulastıgı testi");
        extentTest.pass(" Kayıtlı kullancı HauseHeaven url girer.");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        extentTest.pass(" Kayıtlı kullanıcı HauseHeaven anasayfa header a ulaşır.");
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

       Faker faker=new Faker();
        homePage.signinButonu.click();
        String fakeEmail=faker.internet().emailAddress();
        String fakeSifre=faker.internet().password();
        homePage.emailTextbox.sendKeys(fakeEmail);
        ReusableMethods.bekle(2);
        homePage.passwordTextbox.sendKeys(fakeSifre);
        ReusableMethods.bekle(2);
        homePage.loginButonu.click();



        extentTest.pass(" Kayıtlı kullanıcı listing linkine tıklar.");
        homePage.listingButonu.click();

        extentTest.pass("  Kayıtlı kullanıcı listing sayfasına ulaşır.");
        Assert.assertTrue(homePage.listingfindbybutonu.isDisplayed());
        extentTest.pass("Kayıtlı kullanıcı sayfada seçtiği herhangi bir mülke tıklar.");
        Random random=new Random();

        homePage.listingseciliilan.click();
        extentTest.pass(" Kayıtlı kullanıcı seçtiği mülkün detaylarına ulaşabilğini doğrular");
        ReusableMethods.hover(homePage.listingilangalery);
        Assert.assertTrue(homePage.listingilangalery.isDisplayed());

        extentTest.pass("  Kayıtlı kullanıcı açılan sekmeyi kapatır.");

        Driver.getDriver().quit();

    }
}

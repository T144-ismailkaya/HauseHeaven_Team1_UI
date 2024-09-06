package tests.US_022;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.bouncycastle.pqc.crypto.util.PQCOtherInfoGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_ME04 extends TestBaseRapor {

    @Test
    public  void test04(){

        HomePage homePage=new HomePage();

        extentTest=extentReports.createTest(" mulk sayfasinda punlama ve mesaj gonderildigi testi");
        extentTest.pass("Kayıtlı kullancı HauseHeaven url girer.");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        extentTest.pass("  Kayıtlı kullanıcı HauseHeaven anasayfa header a ulaşır.");
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

        Faker faker=new Faker();
        homePage.signinButonu.click();
        String fakeEmail=faker.internet().emailAddress();
        String fakeSifre=faker.internet().password();
        homePage.emailTextbox.sendKeys(fakeEmail);
        homePage.passwordTextbox.sendKeys(fakeSifre);
        homePage.loginButonu.click();


        extentTest.pass(" Kayıtlı kullanıcı listing linkine tıklar.");
        homePage.listingButonu.click();

        extentTest.pass(" Kayıtlı kullanıcı listing sayfasına ulaşır.");
        homePage.listingButonu.click();

        extentTest.pass("Kayıtlı kullanıcı sayfada seçtiği herhangi bir mülke tıklar.");
        homePage.listingseciliilan.click();

        extentTest.pass(" Kayıtlı kullanıcı seçtiği mülkün detaylarına ulaşabilğini doğrular");
      ReusableMethods.hover(homePage.listingmesajkutususubmitbutonu);
        Assert.assertTrue(homePage.listingmesajkutususubmitbutonu.isDisplayed());
        extentTest.pass(" Kayıtlı kullanıcı sevice,value for money,location,cleanlines alanlarında puanlama yapar.");

        ReusableMethods.bekle(2);
        homePage.listingpuansevice.click();
       homePage.listingpuancleanlines.click();
       homePage.listingpuanvalue.click();
        homePage.listingpuanlocation.click();
        ReusableMethods.bekle(2);

        extentTest.pass("Kayıtlı kullanıcı mesaj alanına mesajı yazar ve send message butonuna basar");
       homePage.listingmesajkutusuElementi.click();
             homePage.listingmesajkutususubmitbutonu.sendKeys("ilanınız hakkında bilgi almak istiyorum");

        homePage.listingmesajkutususubmitbutonu.click();
        extentTest.pass(" Kayıtlı kullanıcı added review successfully penceresını gorerek puan ve mesajın gonderıldıgını doğrular");

        ReusableMethods.bekle(2);
        Assert.assertTrue(homePage.listingmesajgonderildielemnti.isDisplayed());


        extentTest.pass(" Kayıtlı kullanıcı açılan sekmeyi kapatır.");
        Driver.getDriver().quit();

    }
}

package tests.US_022;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_ME03 extends TestBaseRapor {

    @Test
    public void test03(){
        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest("secilen mulkun dogru platforma yonlendirildigi testi ");
        extentTest.pass(" Kayıtlı kullancı HauseHeaven url girer.");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        extentTest.pass(" Kayıtlı kullanıcı HauseHeaven anasayfa header a ulaşır.");
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());

        Faker faker=new Faker();
        homePage.signinButonu.click();
        String fakeEmail=faker.internet().emailAddress();
        String fakeSifre=faker.internet().password();
        ReusableMethods.bekle(2);
        homePage.emailTextbox.sendKeys(fakeEmail);
        homePage.passwordTextbox.sendKeys(fakeSifre);
        homePage.loginButonu.click();

        ReusableMethods.bekle(2);

        extentTest.pass("Kayıtlı kullanıcı listing linkine tıklar.");
        homePage.listingButonu.click();

        extentTest.pass(" Kayıtlı kullanıcı listing sayfasına ulaşır.");
        homePage.listingButonu.click();

        extentTest.pass(" Kayıtlı kullanıcı sayfada seçtiği herhangi bir mülke tıklar.");
        homePage.listingseciliilan.click();
        extentTest.pass(" Kayıtlı kullanıcı seçtiği mülkün detaylarına ulaşabilğini doğrular");
        ReusableMethods.hover(homePage.listingilangalery);
        Assert.assertTrue(homePage.listingilangalery.isDisplayed());
        extentTest.pass(" Kayıtlı kullanıcı mük sayfasında share butonunun üzerine gelerek facebook ikonunu üzerine tıklayarak yeni sekmede facebook platformuna gonderdiğini dogrular");

       ReusableMethods.hover(homePage.listingshare);


        homePage.listingsayfasiilanfacebookElementi.click();

        String facebookwindowhunddle=Driver.getDriver().getWindowHandle();




        extentTest.pass(" Kayıtlı kullanıcı mük sayfasında share butonunun üzerine gelerek twitter ikonunu üzerine tıklayarak yeni sekmede twitter platformuna gonderdiğini dogrular");

        homePage.listingsayfasiilantwitterElementi.click();


        extentTest.pass(" Kayıtlı kullanıcı mük sayfasında share butonunun üzerine gelerek linkedin ikonunu üzerine tıklayarak yeni sekmede linkedin platformuna gonderdiğini dogrular");
        homePage.listingsayfasiilanlinkedinElementi.click();


        extentTest.pass(" Kayıtlı kullanıcı açılan sekmeyi kapatır.");

        Driver.getDriver().quit();

    }
}

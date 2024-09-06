package tests.US_034;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

public class TC_IK006 extends TestBaseRapor {

    @Test
    public void test02() {
        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Admin olarak giriş yapıp Real Estate sayfasının altındaki başlıkların doğru sayfaya erişmesini istiyorum");
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        ReusableMethods.erisimTesti(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.pass("Admin admin sayfasına erişir");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        adminDashboard.usernameTextbox.sendKeys("ismailkaya.admin@hauseheaven.com");
        extentTest.pass("Admin Email/Username textbox'a belirlenmiş email'i girer");
        extentTest.info("ismailkaya.admin@hauseheaven.com");
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.150820");
        extentTest.pass("Admin Password textbox'a belirlenmiş password girer");
        extentTest.info("Hven.150820");
        adminDashboard.signInButonu.click();
        extentTest.pass("Admin Sign In Butonuna basar");

        adminDashboard.realEstateButonu.click();
        extentTest.pass("Admin Real Estate Butonuna basar");

        SoftAssert softAssert = new SoftAssert();

        extentTest.pass("Admin Real Estate başlığının altındaki herhangi bir menüye tıklar ve doğru sayfaya eriştiğini doğrular");

        sayfaDogrulama(adminDashboard.propertiesButonu, "Properties", softAssert);
        sayfaDogrulama(adminDashboard.projectsButonu, "Projects", softAssert);
        sayfaDogrulama(adminDashboard.featuresButonu, "Features", softAssert);
        sayfaDogrulama(adminDashboard.facilitiesButonu, "Facilities", softAssert);
        sayfaDogrulama(adminDashboard.investorsButonu, "Investors", softAssert);
        sayfaDogrulama(adminDashboard.categoriesButonu, "Categories", softAssert);
        sayfaDogrulama(adminDashboard.typesButonu, "Types", softAssert);
        sayfaDogrulama(adminDashboard.reviewsButonu, "Reviews", softAssert);

        adminDashboard.settingsButonu.click();
        softAssert.assertEquals(adminDashboard.settingsSayfaDogrulama.getText(),"Settings");
        //Driver.getDriver().navigate().back();

        softAssert.assertAll();

        Driver.quitDriver();
        extentTest.pass("Admin browser'ı kapatır.");
    }

    private void sayfaDogrulama(WebElement buton, String expectedText, SoftAssert softAssert) {
        AdminDashboard adminDashboard = new AdminDashboard();
        buton.click();
        String actualText = adminDashboard.sayfaDogrulama.getText();
        softAssert.assertEquals(actualText, expectedText, "Sayfa metni şunun için eşleşmiyor: " + expectedText);
    }
}

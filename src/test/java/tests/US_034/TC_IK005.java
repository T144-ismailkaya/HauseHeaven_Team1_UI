package tests.US_034;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_IK005 extends TestBaseRapor {

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Admin olarak giriş yapıp Real Estate sayfasının altındaki başlıkların görüntülenmesini istiyorum");
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        ReusableMethods.erisimTesti(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.pass("Admin admin sayfasına erişir");

        AdminDashboard adminDashboard = new AdminDashboard();

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

        softAssert.assertTrue(adminDashboard.propertiesButonu.isDisplayed(), "Properties menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.projectsButonu.isDisplayed(), "Projects menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.featuresButonu.isDisplayed(), "Features menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.facilitiesButonu.isDisplayed(), "Facilities menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.investorsButonu.isDisplayed(), "Invertors menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.categoriesButonu.isDisplayed(), "Categories menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.typesButonu.isDisplayed(), "Types menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.reviewsButonu.isDisplayed(), "Reviews menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.settingsButonu.isDisplayed(), "Settings menüsü bulunamadı");

        softAssert.assertTrue(adminDashboard.propertiesButonu.isEnabled(), "Properties menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.projectsButonu.isEnabled(), "Projects menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.featuresButonu.isEnabled(), "Features menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.facilitiesButonu.isEnabled(), "Facilities menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.investorsButonu.isEnabled(), "Invertors menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.categoriesButonu.isEnabled(), "Categories menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.typesButonu.isEnabled(), "Types menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.reviewsButonu.isEnabled(), "Reviews menüsü bulunamadı");
        softAssert.assertTrue(adminDashboard.settingsButonu.isEnabled(), "Settings menüsü bulunamadı");

        extentTest.pass("Admin Real Estate başlığının altındaki menüleri doğrular");

        softAssert.assertAll();

        Driver.quitDriver();
        extentTest.pass("Admin browser'ı kapatır.");
    }

}

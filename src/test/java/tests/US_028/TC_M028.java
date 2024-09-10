package tests.US_028;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static utilities.Driver.driver;

public class TC_M028 extends TestBaseRapor {

    @Test
    public void Test28 (){

        extentTest = extentReports.createTest("Admin giriş sayfasından " +
                "Admin Dashboard sayfasına girildiğinde Sidebar bölümündeki sekmelerin görünür olduğu testi");

        //Ziyaretçi browser’ı açar, HauseHeaven Admin giriş URL’ini girer ve enter’a basar

        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.info("Hause Heaven Admin giriş sayfasına gidildi.");


        //HauseHeaven Admin giriş sayfasında olduğunu doğrular.
        String expectedUrl="https://qa.hauseheaven.com/admin/login";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Hause Heaven Admin giriş sayfasında olduğu test edildi.");

        //Admin Login sayfasında geçerli giriş bilgilerini girer ve Log in linkine tıklar
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.usernameTextbox.sendKeys("mehmetyilmaz.admin@hauseheaven.com");
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.150820");
        adminDashboard.signInButonu.click();
        extentTest.info("Admin Login sayfasında geçerli giriş bilgileri girildi ve Log in linkine tıklandı.");

        //Açılan sayfanın Admin Dashboard sayfasında olduğunu test eder.
        Assert.assertTrue(adminDashboard.sefadminHeaderUserNameButtonu.isDisplayed());
        extentTest.pass("Açılan sayfanın Admin Dashboard sayfası olduğu test edildi.");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(adminDashboard.adminSidebarDashboardLinki.isDisplayed(), "Sidebar'da Dashboard bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarBlogLinki.isDisplayed(), "Sidebar'da Blog bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarTestimonialsLinki.isDisplayed(), "Sidebar'da Testimonials bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarRealEstateLinki.isDisplayed(), "Sidebar'da Real Estate bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarNewslettersLinki.isDisplayed(), "Sidebar'da Newsletters bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarConsultsLinki.isDisplayed(), "Sidebar'da Consults bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarAccountsLinki.isDisplayed(), "Sidebar'da Accounts bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarPackagesLinki.isDisplayed(), "Sidebar'da Packages bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarContactLinki.isDisplayed(), "Sidebar'da Contact bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarPaymentsLinki.isDisplayed(), "Sidebar'da Payments bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarLocationsLinki.isDisplayed(), "Sidebar'da Locations bulunamadı");
        softAssert.assertTrue(adminDashboard.adminSidebarMediaLinki.isDisplayed(), "Sidebar'da Media bulunamadı");

        extentTest.pass("Admin Dashboard sayfasına girildiğinde Sidebar bölümündeki sekmelerinin görünür olduğu test edildi ");

        softAssert.assertAll();

        //Admin Dashboard sayfasında Kullanıcı adına tıklar.
        adminDashboard.sefadminHeaderUserNameButtonu.click();
        extentTest.info("Admin Dashboard sayfasında Kullanıcı adına tıklandı.");

        //Admin Dashboard sayfasında Log out linkine tıklar.
        adminDashboard.sefadminHeaderLogoutButtonu.click();
        extentTest.info("Admin Dashboard sayfasında Log out linkine tıklandı.");

        //Sayfayı kapatır
        Driver.quitDriver();
        extentTest.info("Sayfa kapatıldı.");

    }
}

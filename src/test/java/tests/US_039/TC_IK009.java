package tests.US_039;

import org.testng.annotations.Test;
import pages.TeamPages.IsmailPage;
import utilities.*;

public class TC_IK009 extends TestBaseRapor {

    @Test
    public void test03() {
        extentTest = extentReports.createTest("Admin olarak giriş yapıp Real Estate başlığının altındaki Investors sayfasında mevcut yatırımcıyı düzenlemek istiyorum");
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        ReusableMethods.erisimTesti(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.pass("Admin admin sayfasına erişir");

        IsmailPage ismailPage = new IsmailPage();
        IsmailMethods.hauseHeavenAdminLogin(ismailPage,"ismailkaya.admin@hauseheaven.com","Hven.150820");

        ismailPage.realEstateButonu.click();
        extentTest.pass("Admin Real Estate Butonuna basar");
        ismailPage.investorsButonu.click();
        extentTest.pass("Admin açılan menüdeki Investors Butonuna basar");
        ReusableMethods.erisimTesti("https://qa.hauseheaven.com/admin/real-estate/investors");

        //getYatirimciDuzenleme("Emlak Rehberi");

        //getYatirimciDuzenleme("Konut Yolu",
                //"KonutYolu, ev arama sürecinizi keyifli ve sorunsuz hale getirir.");

        IsmailMethods.getYatirimciDuzenleme("Ev Bulurum",
                "EvBulurum, hayalinizdeki evi bulmanız için tasarlanmış modern bir emlak platformudur.",
                "Draft");

        Driver.quitDriver();
        extentTest.pass("Admin browser'ı kapatır.");
    }
}
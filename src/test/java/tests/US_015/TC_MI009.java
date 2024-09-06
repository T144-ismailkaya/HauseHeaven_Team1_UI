package tests.US_015;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.MustafaMethods;
import utilities.TestBaseRapor;

public class TC_MI009 extends TestBaseRapor {

    @Test
    public void test09(){

        extentTest = extentReports.createTest("Şifre değiştirme testi");

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayıcı açıldı ve hause heaven web sitesine gidildi.");

        MustafaMethods.hauseHeavenLogin(ConfigReader.getProperty("MIusername"),ConfigReader.getProperty("MIpassword"));

        HomePage homePage =new HomePage();

        homePage.accountDashboardButonu.click();
        extentTest.pass("Account dashboard butonu tıklandı.");



    }

}

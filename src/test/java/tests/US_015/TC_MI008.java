package tests.US_015;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.MustafaMethods;
import utilities.TestBaseRapor;

public class TC_MI008 extends TestBaseRapor {

    @Test
    public void test08(){

        extentTest = extentReports.createTest("Kredi satın alma testi");

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayıcı açıldı ve hause heaven web sitesine gidildi.");

        MustafaMethods.hauseHeavenLogin(ConfigReader.getProperty("MIusername"),ConfigReader.getProperty("MIpassword"));

        HomePage homePage =new HomePage();

        homePage.accountDashboardButonu.click();
        extentTest.pass("Account dashboard butonu tıklandı.");



    }

}

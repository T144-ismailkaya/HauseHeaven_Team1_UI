package tests.US_016;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R014 extends TestBaseRapor {
    @Test
    public void Test01(){

        extentTest=extentReports.createTest
            ("Kayitli kullanicinin properties sayfasinda reload butonunun calismasi testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

    }
}

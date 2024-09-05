package tests.US_044;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R023 extends TestBaseRapor { @Test
public void Test01(){
    extentTest=extentReports.createTest
            ("Admin dashboardda newsletterlar icinde delete butonunun calismasi testi");
    Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
    extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");


    Driver.getDriver().quit();
    extentTest.pass("Ziyaretci browseri kapatir.");
}
}

package tests.US_48;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R029 extends TestBaseRapor {
    @Test
    public void Test01(){
        extentTest=extentReports.createTest
                ("Admin dashboardunda mesaj arama kutusuna gecersiz bilgi girildiginde No data displayed yazisinin gorulmesi testi ");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

        Driver.quitDriver();
        extentTest.pass("Ziyaretci browseri kapatir.");

    }
}

package tests.US_016;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R013 extends TestBaseRapor {
    @Test
    public void Test01(){

        extentTest=extentReports.createTest
                ("Kayitli kullanicinin search butonunu kullanarak ilaninlar icinde arama yapar");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

        Driver.quitDriver();
        extentTest.pass("Ziyaretci browseri kapatir.");
    }
}

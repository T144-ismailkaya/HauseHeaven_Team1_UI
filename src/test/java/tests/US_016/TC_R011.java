package tests.US_016;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R011 extends TestBaseRapor {
    @Test
    public void Test01(){

        //Failed oluyor

        extentTest=extentReports.createTest
                ("Kayitli kullanicinin zorunlu alanlardan Property location kutusu bos birakildiginda kayit yapmamasi testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

        Driver.getDriver().quit();
        extentTest.pass("Ziyaretci browseri kapatir.");
    }
}

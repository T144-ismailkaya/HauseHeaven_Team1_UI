package tests.US_48;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R030 extends TestBaseRapor {
    @Test
public void Test01(){
        extentTest=extentReports.createTest
                ("Admin dashboardunda mesajlar listelendiginde silme, duzenleme ve yeni mesaj olusturma islemlerinin yapilabilmesi testi ");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

        Driver.quitDriver();
        extentTest.pass("Ziyaretci browseri kapatir.");

}
}

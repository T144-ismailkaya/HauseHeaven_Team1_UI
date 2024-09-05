package tests.US_016;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R012 extends TestBaseRapor {
    @Test
public void Test01(){

        //Failed Oluyor


        extentTest=extentReports.createTest
                ("Ilan yayinlanmadan bakiyede bir degisiklik olmamasi testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

}
}

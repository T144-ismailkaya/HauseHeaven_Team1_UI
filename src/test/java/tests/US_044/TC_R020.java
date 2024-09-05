package tests.US_044;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R020 extends TestBaseRapor {
    @Test
public void Test01(){
        extentTest=extentReports.createTest
            ("Ziyaretci anasayfada subscribe kutusuna mail girisi yapar testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");


    }
}

package tests.US_008;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {

    @Test
    public void test01(){
        extentTest = extentReports.createTest("Anasayfaya testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Anasayfaya gider");

        System.out.println("Hello Konya");
        extentTest.info("Hello Konya yazıldı");




    }

}

package tests.US_044;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R024 extends TestBaseRapor {
    @Test
public void Test01(){
        extentTest=extentReports.createTest
                ("Admin dashboardda newsletterlarin CSV ya da Excel formatinda export edilebilmesi testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

        Driver.quitDriver();
        extentTest.pass("Ziyaretci browseri kapatir.");

}
}

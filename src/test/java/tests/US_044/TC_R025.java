package tests.US_044;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_R025 extends TestBaseRapor {
    @Test
public void Test01(){
        extentTest=extentReports.createTest
                ("Admin dashboardda newsletterlarin 10/30/50/100/500/All seklinde siralanabilmesi testi");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

}
}

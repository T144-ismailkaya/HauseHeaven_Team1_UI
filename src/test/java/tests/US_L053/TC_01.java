package tests.US_L053;

import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {

    @Test
    public void TC01() {
        AdminDashboard adminDashboard = new AdminDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        System.out.println("Konya");


    }

}

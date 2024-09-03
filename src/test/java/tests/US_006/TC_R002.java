package tests.US_006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_R002 {
    @Test
    public void Test01() {
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        HomePage homePage = new HomePage();
        homePage.HomePageListingLink.click();

        String expectedYazisiDegil="0 Results";
        String actualYazi=homePage.listingResultsYazisi.getText();

        Assert.assertNotEquals(actualYazi,expectedYazisiDegil);
        Driver.quitDriver();



    }
}
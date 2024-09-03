package tests.US_006;

import org.testng.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.annotations.Test;

public class TC_R001 {
    @Test
    public void Test01(){
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        HomePage homePage=new HomePage();
        homePage.HomePageListingLink.click();

        String expectedYazi="Properties";
        String actualYazi=homePage.listingPropertiesYazisi.getText();

        Assert.assertEquals(actualYazi,expectedYazi);
        Driver.quitDriver();

    }
}

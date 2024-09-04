package tests.US_006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_R003 {
    @Test
    public void Test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        HomePage homePage = new HomePage();
        homePage.HomePageListingLink.click();

        ReusableMethods.hover(homePage.listingPageDigerSayfayaGecmeButonu);
        homePage.listingPageDigerSayfayaGecmeButonu.click();

        ReusableMethods.hover(homePage.listingUcuncuSayfaIlanYaziElementi);
        homePage.listingUcuncuSayfaIlanYaziElementi.isDisplayed();


        Driver.quitDriver();


    }
}

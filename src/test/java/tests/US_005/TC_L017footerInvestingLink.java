package tests.US_005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

import java.util.List;

public class TC_L017footerInvestingLink {

    @Test

    public void TC017() {

        //Ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
        HomePage homePage = new HomePage();
        LeventMethods.footerhomepageScroll();

        //Ziyaretci footer bolumunde yer alan "Investing in Vacation Rental Properties: A Lucrative Opportunity" tab'ina tiklar
        homePage.sefFooterRiseOfSustainebaleElementi.click();
        ReusableMethods.getFullScreenshot(Driver.getDriver());

        //Ziyaretci ayni sekmede "The Rise Of Sustainable Homes" sayfasinin acildigini kontrol eder
        int winHandleTimes = 1;
        Assert.assertEquals(Driver.getDriver().getWindowHandles().size(), winHandleTimes);

        //Ziyaretci "Investing in Vacation Rental Properties: A Lucrative Opportunity" sayfasinda asagiya footer bolumune scroll yapar
        LeventMethods.footerhomepageScroll();
        //Ziyaretci guideline da verilen footer ogelerinin "Investing in Vacation Rental Properties: A Lucrative Opportunity"sayfasinin altinda yer aldigini  kontrol eder
        LeventMethods.footerOgeKarsilastirma();
        //Ziyaretci halen  "Investing in Vacation Rental Properties: A Lucrative Opportunity" sayfasinda oldgunu dogrular

        String expectedUrl = "https://hauseheaven.com/news/investing-in-vacation";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);

        //Ziyratci tarayiciyi kapatir

        Driver.quitDriver();
    }
}


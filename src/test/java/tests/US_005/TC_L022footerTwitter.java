package tests.US_005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

public class TC_L022footerTwitter {

    @Test
    public void TC022twitter() {
        HomePage homePage = new HomePage();
        //Ziyaretci hausehaen Url'ine giris saglar ve footer bolumune scroll yapar
        LeventMethods.footerhomepageScroll();
        //Ziyaretci footer bolumunde yer alan "Twitter" logosuna  tiklar
        homePage.SeftwitterBoxButtonElementi.click();
        //Ziyaretci yeni sekmede "Hauseheaven-Twitter" sayfasinin ayri sekmede acildigini kontrol eder
        LeventMethods.windowsHanldes(2);
        //Ziyaretci Twitter'in resmi websitesine gittigini onaylar
        String expectedUrL="https://www.twitter.com/";
        String actualurl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualurl,expectedUrL);
        ReusableMethods.getFullScreenshot(Driver.getDriver());
        //Ziyratci tarayiciyi kapatir
        Driver.quitDriver();


    }
}

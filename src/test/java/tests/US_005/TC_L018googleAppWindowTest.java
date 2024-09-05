package tests.US_005;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

public class TC_L018googleAppWindowTest {


    @Test

    public void TC018googleAPPNewWindow(){
        HomePage homePage=new HomePage();
        //Ziyaretci hausehaen Url'ine giris saglar ve footer bolumune scroll yapar
        LeventMethods.footerhomepageScroll();
         //Ziyaretci footer bolumunde yer alan "Hauseheaven Google App" tab'ina tiklar
        homePage.sefFooterGoogleAPPelementi.click();
        //Ziyaretci farkli sekmede "Hauseheaven Google App" sayfasinin acildigini kontrol eder
        ReusableMethods.getFullScreenshot(Driver.getDriver());
        LeventMethods.windowsHanldes(2);
        //Ziyratci tarayiciyi kapatir
        Driver.quitDriver();
    }


}

package tests.US_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.LeventMethods;

public class TC_L027footerPinterst {

    @Test
    public void TC027footerPinterst() {
         HomePage homePage = new HomePage();
        //Ziyaretci hausehaen Url'ine giris saglar ve footer bolumune scroll yapar
        LeventMethods.footerhomepageScroll();
        //Ziyaretci footer bolumunde yer alan "Linkedin" logosuna  tiklar
       homePage.SefFooterPintestButtonElementi.click();
        //Ziyaretci yeni sekmede "Hauseheaven-Pinterst" sayfasinin ayri sekmede acildigini kontrol eder
        LeventMethods.windowsHanldes(2);
        //Ziyratci tarayiciyi kapatir
        Driver.quitDriver();


    }
}

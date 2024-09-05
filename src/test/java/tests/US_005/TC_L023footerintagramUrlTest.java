package tests.US_005;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.LeventMethods;

public class TC_L023footerintagramUrlTest {

    @Test
    public void TC021facebook() {
        HomePage homePage = new HomePage();
        //Ziyaretci hausehaen Url'ine giris saglar ve footer bolumune scroll yapar
        LeventMethods.footerhomepageScroll();
        //Ziyaretci footer bolumunde yer alan "Instagram" logosuna  tiklar
       homePage.SefFooterInstagramButtonElementi.click();
       //Ziyaretci yeni sekmede "Hauseheaven-Facebook" sayfasinin ayri sekmede acildigini kontrol eder
        LeventMethods.windowsHanldes(2);
        //Ziyratci tarayiciyi kapatir
        Driver.quitDriver();
    }
}

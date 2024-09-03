package tests.US_004;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.*;

public class TC_L001 {

    @Test
    public void TC01(){
        HomePage homePage=new HomePage();
        Actions actions=new Actions(getDriver());
         //Ziyaretçi hausehaen URL'sine erişim sağlar

        getDriver().get(ConfigReader.getProperty("hauseUrl"));

        //Ziyaretçi ana sayfanın Gövde bölümüne erişir


        //Ziyaretçi konum arama kutusuna tıklar



        //Ziyaretçi arama kutusuna istediği ülkenin veya şehrin adını yazar

        //Arama Sonucu düğmesine basarak arama yapar



        //Döndürülen sonuçların arama kutusundaki ülke/şehir adıyla aynı olduğunu onaylar
        

        //Ziyaretçi açılan sekmeyi kapatır

        Driver.quitDriver();


    }


}

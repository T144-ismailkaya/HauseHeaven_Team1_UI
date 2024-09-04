package tests.US_005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_L006_footerAdress {

    @Test
    public void Test06(){

         HomePage homePage=new HomePage();

         //Ziyaretci hausehaen Url'ine giris saglar
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        //Ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
        ReusableMethods.hover(homePage.SefFooterElementi);
        homePage.sefUsercookies.click();
        //Ziyaretci footer bolumunde hauseheaven logosun yer aldigini dogrular
        Assert.assertTrue(homePage.sefFooterLogo.isDisplayed());

        //Ziyaretci fotoer bolumunde  hauseheaven  sirket adresinin yer aldigini dogrular
        Assert.assertTrue(homePage.seffooterAddresselementi.isDisplayed());
        //Ziyaretci taraciyi kapatir

        Driver.quitDriver();

    }




}

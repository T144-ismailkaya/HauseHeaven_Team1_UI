package tests.US_004;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03_pozitifDDMTesti {
    @Test
    public void TC03dropDownTest(){
        HomePage homePage=new HomePage();
        //Ziyaretci hausehaen Url'ine giris saglar
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        //Ziyaretci anasayfa Body bolumune erisim saglar
        ReusableMethods.hover(homePage.sefUserBodysearchButtonElementi);

        //Ziyaretci search for location box'ina tiklar
        homePage.sefUserSearhforloactionboxElementi.click();
        //Ziyaretci  searchbox'a istedigi ulke veya sehir ismini yazar
        homePage.sefUserSearhforloactionboxElementi.sendKeys("New York");
        //Ziyaretci "Min Price" ddm menusunde  istedigi fiyati secer
         Select selectMinPrice=new Select(homePage.sefSearchBoxMinPriceDDM);
        selectMinPrice.selectByValue("500");
        //Ziyaretci "MaxPrice" ddm menusunde istedigi fiyati secer
        Select selectMax=new Select(homePage.sefSearchBoxMaxPriceDDM);
        selectMax.selectByValue("2000");
        //Ziyaretci "Property Type" ddm menusunde  istgedi ev turunu secer
        Select  selectProperty=new Select(homePage.sefSearchBoxPropertyTypeDDM);
        selectProperty.selectByValue("3");
        //Ziyaretci "Bed Rooms"ddm menusunde istedigi  Bedroom turunu secer
        Select  selectBedroom=new Select(homePage.sefSearchBoxBedroomTypeDDM);
        selectBedroom.selectByValue("3");
        //Ziyaretci acilan  tarayici kapatir
        Driver.quitDriver();

    }

}


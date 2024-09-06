package utilities;

import org.testng.Assert;
import pages.HomePage;

import java.util.List;

public class LeventMethods {

    public static void  footerhomepageScroll () {

        HomePage homePage=new HomePage();

        //Ziyaretci hausehaen Url'ine giris saglar
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        //Ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
        ReusableMethods.hover(homePage.SefFooterElementi);
        homePage.sefUsercookies.click();
        ReusableMethods.wait(2);


    }

    public  static void footerOgeKarsilastirma(){
    HomePage homePage=new HomePage();
        List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
        System.out.println(footerAltUstDizinList);
        String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
                "+1 246-345-0695\n" +
                "info@hauseheaven.com, About\n" +
                "About us\n" +
                "Contact us\n" +
                "Terms & Conditions, More Information\n" +
                "All properties\n" +
                "Houses for sale\n" +
                "Houses for rent, News\n" +
                "The Benefits Of Investing In Emerging Real Estate Markets\n" +
                "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
                "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
                "How to Stage Your Home for a Quick and Profitable Sale\n" +
                "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
                "Google Play\n" +
                "Get It Now\n" +
                "App Store\n" +
                "Now it Available]";
        for (String eachelements : footerAltUstDizinList) {
            Assert.assertTrue(expetedFooterElements.contains(eachelements));
        }

    }
    public static void windowsHanldes( int sayi){

       // int winHandleTimes = sayi;
        Assert.assertEquals(Driver.getDriver().getWindowHandles().size(), sayi);
    }

    public static void admingirisDashboard (){


        //Admin admin hauseheaven'url erisim saglar
        //Adminhausehaven Login sayfasinda Login box kutusu icerseinde  yer alan Email/Username box'ina  saglanan email yazar
        //Adminhausehaven Login sayfasinda Login box kutusu icerseinde  yer alan Password box'ina onceden verilmis passoword'u  yazar
        //Adminhausehaven Login sayfasinda Login box kutusu icerseinde  yer alan  Login Butonuna tiklar
        //Adminhausehaven admin sitesine basarili sekilde giris yapildigini kontrol eder

    }
}

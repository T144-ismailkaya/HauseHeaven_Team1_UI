package tests.US_029;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

public class TC_L032admninPostSayfaCheck {

    @Test
    public void TC032adminPostTesti() {

        AdminDashboard adminDashboard = new AdminDashboard();
        //Admin hauseheaven Admin sayfasina onceden verilmis Username ve Password Ile basarili sekilde giris saglar
        LeventMethods.admingirisDashboard();

        //Admin sayfasinda SideNavigation da yer alan Blog basliginin altinda ki "Post" tiklar ayni sekmede acildigini   kontrol eder
        adminDashboard.sefadminsideDashBlogButtonElementi.click();
        ReusableMethods.wait(1);
        adminDashboard.sefSidenNavPostselementi.click();
        LeventMethods.windowsHanldes(1);
        //Admin "post"page'in Ursini karsilastirarak test dogru sayfa oldugunu test eder.
        String expectedUrl="https://qa.hauseheaven.com/admin/blog/posts";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        //Admin sayfa  ayni sekmede acilan yeni sayafa ki  verilen ilanlarin listesini yazdirir
        System.out.println(ReusableMethods.getStringList(adminDashboard.sefadminPostPageList));

        //Admin  acilan yeni sayfada da side navigation barin oldugunu test eder

        Assert.assertTrue(adminDashboard.sefadminSidedDashElementi.isDisplayed());

        //Admin basarili sekilde cikis yapar ve taraciyi kapatir
        LeventMethods.adminLogoutTesti();


    }

}

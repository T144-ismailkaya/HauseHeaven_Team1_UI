package tests.US_029;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

public class TC_L033TadminCategoriesSayfaCheck {
    @Test
    public void TC033adminCategoriesPageTesti() {

        AdminDashboard adminDashboard = new AdminDashboard();
        //Admin hauseheaven Admin sayfasina onceden verilmis Username ve Password Ile basarili sekilde giris saglar
        LeventMethods.admingirisDashboard();
        //Admin sayfasinda SideNavigation da yer alan Blog basliginin altinda ki "Categories" tiklar ayni sekmede acildigini   kontrol eder
        adminDashboard.sefadminsideDashBlogButtonElementi.click();
        ReusableMethods.wait(1);
        adminDashboard.categoriesButonu.click();
        LeventMethods.windowsHanldes(1);
        //Admin "post"page'in Ursini karsilastirarak test dogru sayfa oldugunu test eder.
        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/categories";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        //Admin  acilan yeni sayfada da side navigation barin oldugunu test eder

        Assert.assertTrue(adminDashboard.sefadminSidedDashElementi.isDisplayed());

        //Admin basarili sekilde cikis yapar ve taraciyi kapatir
        LeventMethods.adminLogoutTesti();


    }
}

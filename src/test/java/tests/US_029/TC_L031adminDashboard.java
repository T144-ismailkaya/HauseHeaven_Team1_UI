package tests.US_029;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.LeventMethods;
import utilities.ReusableMethods;

import java.util.List;

public class TC_L031adminDashboard {

    @Test
     public void TCL031 (){
         AdminDashboard adminDashboard=new AdminDashboard();
         //Admin hauseheaven Admin sayfasina onceden verilmis Username ve Password Ile basarili sekilde giris saglar
        LeventMethods.admingirisDashboard();
         //Adminadmin sayfasinin icinde sideNavigation yer alan blog linkine tiklar
         adminDashboard.sefadminsideDashBlogButtonElementi.click();
         ReusableMethods.wait(1);
         //Admin"Posts","Categories","Tags"  menulerin gorunur oldugunu test eder
        List<String> admingBlogTabList= ReusableMethods.getStringList(adminDashboard.sefadminsideDashBlogList);
        System.out.println(admingBlogTabList);
        for (String tagElement : admingBlogTabList) {
            Assert.assertTrue(tagElement.contains("Tags"));
            Assert.assertTrue(tagElement.contains("Categories"));
            Assert.assertTrue(tagElement.contains("Posts"));
        }
        //Admin basarili sekilde cikis yapar ve taraciyi kapatir

        LeventMethods.adminLogoutTesti();

     }

}

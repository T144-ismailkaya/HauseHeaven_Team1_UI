package utilities;

import pages.AdminDashboard;

public class IsmailMethods extends TestBaseRapor{

    public static void hauseHeavenAdminLogin(AdminDashboard adminDashboard,String username,String password){
        adminDashboard.usernameTextbox.sendKeys(username);
        extentTest.pass("Admin Email/Username textbox'a belirlenmiş email'i girer");
        extentTest.info(username);
        adminDashboard.passwordAdminTextbox.sendKeys(password);
        extentTest.pass("Admin Password textbox'a belirlenmiş password girer");
        extentTest.info(password);
        adminDashboard.signInButonu.click();
    }


}

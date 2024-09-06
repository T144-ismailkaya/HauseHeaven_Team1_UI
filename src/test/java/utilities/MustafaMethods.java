package utilities;

import pages.HomePage;

public class MustafaMethods extends TestBaseRapor{

    public static void hauseHeavenLogin(String username, String password){
        HomePage homePage = new HomePage();
        homePage.signinButonu.click();
        extentTest.pass("Sign in butonuna tıklandı.");

        homePage.emailTextbox.sendKeys(username);
        extentTest.pass("Mail text box'a mail girildi.");
        extentTest.info(username);

        homePage.passwordTextbox.sendKeys(password);
        extentTest.pass("Password text box'a password girildi.");
        extentTest.info(password);

        homePage.loginButonu.click();
        extentTest.pass("Login butonu tıklandı.");

    }

}

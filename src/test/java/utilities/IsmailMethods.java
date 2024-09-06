package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.AdminDashboard;
import pages.TeamPages.IsmailPage;

import java.util.ArrayList;
import java.util.List;

public class IsmailMethods extends TestBaseRapor {

    public static void hauseHeavenAdminLogin(AdminDashboard adminDashboard, String username, String password) {
        adminDashboard.usernameTextbox.sendKeys(username);
        extentTest.pass("Admin Email/Username textbox'a belirlenmiş email'i girer");
        extentTest.info(username);
        adminDashboard.passwordAdminTextbox.sendKeys(password);
        extentTest.pass("Admin Password textbox'a belirlenmiş password girer");
        extentTest.info(password);
        adminDashboard.signInButonu.click();
        extentTest.pass("Admin Sign In Butonuna basar");
    }

    public static void getYatirimciEkleme(String name, String description, String status) {
        IsmailPage ismailPage = new IsmailPage();
        ismailPage.createButonu.click();

        ismailPage.nameTextbox.sendKeys(name);
        ismailPage.descriptionTextbox.sendKeys(description);

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id='status']"));
        Select select1 = new Select(element);

        if (status.equals("Published")) {
            select1.selectByVisibleText("Published");
        } else if (status.equals("Draft")) {
            select1.selectByVisibleText("Draft");
        } else if (status.equals("Pending")) {
            select1.selectByVisibleText("Pending");
        }

        ismailPage.saveExit.click();

        List<WebElement> ekledigimizInvestors = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[3]"));
        List<String> eklenenProje = new ArrayList<>();

        for (WebElement each : ekledigimizInvestors) {
            eklenenProje.add(each.getText());
        }

        Assert.assertEquals(eklenenProje.get(0), name);
    }
}

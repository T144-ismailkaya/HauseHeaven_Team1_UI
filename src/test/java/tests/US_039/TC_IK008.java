package tests.US_039;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.TeamPages.IsmailPage;
import utilities.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC_IK008 extends TestBaseRapor {



    @Test
    public void test02() {
        extentTest = extentReports.createTest("Admin olarak giriş yapıp Real Estate başlığının altındaki Investors sayfasında mevcut yatırımcıları görüntülemek istiyorum");
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        ReusableMethods.erisimTesti(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.pass("Admin admin sayfasına erişir");
        IsmailPage ismailPage = new IsmailPage();
        AdminDashboard adminDashboard = new AdminDashboard();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        IsmailMethods.hauseHeavenAdminLogin(adminDashboard,"ismailkaya.admin@hauseheaven.com","Hven.150820");

        ismailPage.realEstateButonu.click();
        extentTest.pass("Admin Real Estate Butonuna basar");
        ismailPage.investorsButonu.click();
        extentTest.pass("Admin açılan menüdeki Investors Butonuna basar");
        ReusableMethods.erisimTesti("https://qa.hauseheaven.com/admin/real-estate/investors");

        IsmailMethods.getYatirimciEkleme("Emlak Kapısı",
                "EmlakKapısı, hayalinizdeki evi bulmanızı kolaylaştıran kullanıcı dostu bir platformdur.",
                "Published");

        Driver.quitDriver();
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

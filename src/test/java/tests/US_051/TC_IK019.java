package tests.US_051;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TeamPages.IsmailPage;
import utilities.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TC_IK019 extends TestBaseRapor {

    @Test
    public void test05() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        extentTest = extentReports.createTest("Kullanıcı olarak siteye giriş yapıp kendi sayfam üzerinden credi satın alma işlemini gerçekleştrip admin sayfasından kontrol etmek istiyorum");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Kullanıcı Hause Heaven sayfasına erişir");

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy" + "-" + "MM" + "-" + "dd");
        String formattedDate = localDateTime.format(timeFormatter);

        IsmailPage ismailPage = new IsmailPage();
        if (ismailPage.allowCookies.isDisplayed()){
            ismailPage.allowCookies.click();
        }
        ismailPage.signInButonu.click();

        ismailPage.emailTextbox.sendKeys("ismailkaya@hauseheaven.com");
        ismailPage.passwordTextbox.sendKeys("Hven.150820");
        ismailPage.loginButonu.click();

        ismailPage.usernamePage.click();
        ismailPage.buyCredit.click();

        WebElement paketFiyati = Driver.getDriver().findElement(By.xpath("(//*[@class='list-group-item'])[4]"));
        String paketFiyatiString = paketFiyati.getText();
        paketFiyatiString = paketFiyatiString.replaceAll("//D", "");
        paketFiyatiString = paketFiyatiString.replace("$", "");
        paketFiyatiString = paketFiyatiString.replace(",", "");
        paketFiyatiString = paketFiyatiString.substring(0, 4);

        ismailPage.besPostsCell.click();

        String name = "İsmail Kaya";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stripe-number")));

        jse.executeScript("window.scrollTo(0, 100);");

        ismailPage.cardNumber.sendKeys("4242424242424242");
        ismailPage.ayYil.sendKeys("0229");
        ismailPage.fullName.sendKeys(name);
        ismailPage.cvc.sendKeys("379");
        ismailPage.checkoutButonu.click();

        WebElement alertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert-container")));

        String expectedMessage = "Add credit successfully!";
        String actualMessage = alertMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

        wait.until(ExpectedConditions.visibilityOf(ismailPage.logoutButonu));
        ismailPage.logoutButonu.click();

        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        ReusableMethods.erisimTesti(ConfigReader.getProperty("hauseAdminUrl"));

        IsmailMethods.hauseHeavenAdminLogin(ismailPage, "ismailkaya.admin@hauseheaven.com", "Hven.150820");

        ismailPage.paymentsButonu.click();
        ismailPage.transactionsButonu.click();

        // Kart bilgileri ile girdiğimiz ismi admin sayfasındaki isimle karşılaştırma
        List<WebElement> paymentIsimList = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[4]"));
        List<String> isimlerinStringList = ReusableMethods.getStringList(paymentIsimList);

        for (int i = 1; i < isimlerinStringList.size(); i++) {
            isimlerinStringList.get(i).equals(name);
        }

        // Paket almadan önceki zaman(2024-08-21) ile admin sayfasındaki alınan zamanın karşılaştırılması
        WebElement timePayment = Driver.getDriver().findElement(By.xpath("(//*[normalize-space(@class)='column-key-created_at'])[1]"));
        String paymentText = timePayment.getText();
        Assert.assertEquals(paymentText, formattedDate);

        // Aldığımız paketin fiyatı ile admin sayfasındaki fiyatın karşılaştırılması
        WebElement paymentFiyati = Driver.getDriver().findElement(By.xpath("(//*[normalize-space(@class)='text-start column-key-amount'])[1]"));
        String paymentStringFiyat = paymentFiyati.getText();
        paymentStringFiyat = paymentStringFiyat.replaceAll("//D", "");
        paymentStringFiyat = paymentStringFiyat.substring(0, 4);

        Assert.assertTrue(paketFiyatiString.contains(paymentStringFiyat));

        Driver.quitDriver();

    }
}

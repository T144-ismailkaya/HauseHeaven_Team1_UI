package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
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

    public static void hauseHeavenAdminLogin(IsmailPage ismailPage, String username, String password) {
        ismailPage.usernameTextbox.sendKeys(username);
        extentTest.pass("Admin Email/Username textbox'a belirlenmiş email'i girer");
        extentTest.info(username);
        ismailPage.passwordAdminTextbox.sendKeys(password);
        extentTest.pass("Admin Password textbox'a belirlenmiş password girer");
        extentTest.info(password);
        ismailPage.adminSignInButonu.click();
        extentTest.pass("Admin Sign In Butonuna basar");
    }

    public static void sayfaDogrulama(WebElement buton, String expectedText, SoftAssert softAssert) {
        IsmailPage ismailPage = new IsmailPage();
        buton.click();
        String actualText = ismailPage.sayfaDogrulama.getText();
        softAssert.assertEquals(actualText, expectedText, "Sayfa metni şunun için eşleşmiyor: " + expectedText);
    }

    public static void getYatirimciEkleme(String name, String description, String status) {
        IsmailPage ismailPage = new IsmailPage();
        ismailPage.createButonu.click();
        extentTest.pass("Admin Create butonuna basar");

        ismailPage.nameTextbox.sendKeys(name);
        extentTest.pass("Admin Name textbox'a belirlenmiş name yazar");
        extentTest.info(name);
        ismailPage.descriptionTextbox.sendKeys(description);
        extentTest.pass("Admin Description textbox'a belirlenmiş description yazar");
        extentTest.info(description);


        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id='status']"));
        Select select1 = new Select(element);

        if (status.equals("Published")) {
            select1.selectByVisibleText("Published");
        } else if (status.equals("Draft")) {
            select1.selectByVisibleText("Draft");
        } else if (status.equals("Pending")) {
            select1.selectByVisibleText("Pending");
        }

        extentTest.pass("Admin Status kısmından listelenen seçeneklerden Published olanına tıklar");

        ismailPage.saveExit.click();
        extentTest.pass("Admin Save & Exit butonuna basar");

        List<WebElement> ekledigimizInvestors = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[3]"));
        List<String> eklenenProje = new ArrayList<>();

        for (WebElement each : ekledigimizInvestors) {
            eklenenProje.add(each.getText());
        }

        Assert.assertEquals(eklenenProje.get(0), name);
        extentTest.pass("Admin eklediği ile listedeki yatırımcıyı doğrular");
    }

    public static void getYatirimciDuzenleme(String name) {
        IsmailPage ismailPage = new IsmailPage();
        WebElement enSonEklenenProje = Driver.getDriver()
                .findElement(By.xpath("(//tbody/tr[1]/td[7]//*[@class='table-actions']//*[@data-bs-toggle='tooltip'])[1]"));
        enSonEklenenProje.click();
        extentTest.pass("Admin hergangi bir herhangi bir yatırımcının edit butonuna tıklar");

        ismailPage.nameTextbox.clear();
        ismailPage.nameTextbox.sendKeys(name);
        extentTest.pass("Admin, Name textbox'taki mevcut ismi siler ve yeni bir isim yazar.");
        ismailPage.saveExit.click();
        extentTest.pass("Admin Save & Exit butonuna basar");

        List<WebElement> ekledigimizInvestors = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[3]"));
        List<String> eklenenProje = new ArrayList<>();

        for (WebElement each : ekledigimizInvestors) {
            eklenenProje.add(each.getText());
        }

        Assert.assertEquals(eklenenProje.get(0), name);
        extentTest.pass("Admin düzenlediği ile listedeki yatırımcıyı doğrular");
    }

    public static void getYatirimciDuzenleme(String name, String description) {
        IsmailPage ismailPage = new IsmailPage();
        WebElement enSonEklenenProje = Driver.getDriver()
                .findElement(By.xpath("(//tbody/tr[1]/td[7]//*[@class='table-actions']//*[@data-bs-toggle='tooltip'])[1]"));
        enSonEklenenProje.click();
        extentTest.pass("Admin hergangi bir herhangi bir yatırımcının edit butonuna tıklar");

        ismailPage.nameTextbox.clear();
        ismailPage.nameTextbox.sendKeys(name);
        extentTest.pass("Admin, Name textbox'taki mevcut ismi siler ve yeni bir isim yazar.");
        ismailPage.descriptionTextbox.clear();
        ismailPage.descriptionTextbox.sendKeys(description);
        extentTest.pass("Admin, Desctiption textbox'taki mevcut açıklamayı siler ve yeni bir açıklama yazar.");
        ismailPage.saveExit.click();
        extentTest.pass("Admin Save & Exit butonuna basar");

        List<WebElement> ekledigimizInvestors = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[3]"));
        List<String> eklenenProje = new ArrayList<>();

        for (WebElement each : ekledigimizInvestors) {
            eklenenProje.add(each.getText());
        }

        Assert.assertEquals(eklenenProje.get(0), name);
        extentTest.pass("Admin düzenlediği ile listedeki yatırımcıyı doğrular");
    }

    public static void getYatirimciDuzenleme(String name, String description, String status) {
        IsmailPage ismailPage = new IsmailPage();
        WebElement enSonEklenenProje = Driver.getDriver()
                .findElement(By.xpath("(//tbody/tr[1]/td[7]//*[@class='table-actions']//*[@data-bs-toggle='tooltip'])[1]"));
        enSonEklenenProje.click();
        extentTest.pass("Admin hergangi bir herhangi bir yatırımcının edit butonuna tıklar");

        ismailPage.nameTextbox.clear();
        ismailPage.nameTextbox.sendKeys(name);
        extentTest.pass("Admin, Name textbox'taki mevcut ismi siler ve yeni bir isim yazar.");
        ismailPage.descriptionTextbox.clear();
        ismailPage.descriptionTextbox.sendKeys(description);
        extentTest.pass("Admin, Desctiption textbox'taki mevcut açıklamayı siler ve yeni bir açıklama yazar.");

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id='status']"));
        Select select1 = new Select(element);

        if (status.equals("Published")) {
            select1.selectByVisibleText("Published");
        } else if (status.equals("Draft")) {
            select1.selectByVisibleText("Draft");
        } else if (status.equals("Pending")) {
            select1.selectByVisibleText("Pending");
        }
        extentTest.pass("Admin, Status dropdown'daki mevcut yatırımcı durumu değiştirir");

        ismailPage.saveExit.click();

        List<WebElement> ekledigimizInvestors = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[3]"));
        List<String> eklenenProje = new ArrayList<>();

        for (WebElement each : ekledigimizInvestors) {
            eklenenProje.add(each.getText());
        }

        Assert.assertEquals(eklenenProje.get(0), name);
        extentTest.pass("Admin düzenlediği ile listedeki yatırımcıyı doğrular");
    }

    public static void getYatirimciSilme(int yatirimciNo) {
        IsmailPage ismailPage = new IsmailPage();
        String dinamikXpath = "(//tbody/tr[" + yatirimciNo + "]/td[7]//*[@class='table-actions']//*[@data-bs-toggle='tooltip'])[2]";
        WebElement xpath = Driver.getDriver().findElement(By.xpath(dinamikXpath));
        xpath.click();
        extentTest.pass("Admin listelenen yatırımcılardan herhangi birinin 'Çöp Kutusu' işaretine basar");
        ismailPage.deleteButonu.click();
        extentTest.pass("Admin Delete butonuna basarak silme işlemini onaylar.");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Boolean isPresent = (Boolean) js.executeScript(
                "return document.evaluate(\"//*[contains(text(), 'Deleted successfully')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue !== null;"
        );
        Assert.assertTrue(isPresent, "Success message was not found in the DOM");
        extentTest.pass("Admin silme işleminin gerçekleştiğini doğrular");
    }

    public static void getYatirimciEkleme() {
        IsmailPage ismailPage = new IsmailPage();
        ismailPage.createButonu.click();
        extentTest.pass("Admin Create butonuna basar");

        ismailPage.saveExit.click();
        extentTest.pass("Admin Save & Exit butonuna basar");

        Assert.assertTrue(ismailPage.nameHataMesaji.isDisplayed(), "Hata mesajı görünmüyor.");

        String expectedMesaj = "The name field is required.";
        String actualMesaj = ismailPage.nameHataMesaji.getText();
        Assert.assertEquals(actualMesaj, expectedMesaj, "Hata mesajı beklenenle eşleşmiyor.");
        extentTest.pass("Admin hata mesajını görüntüler ve doğrular");

        String expectedUrl = "https://qa.hauseheaven.com/admin/real-estate/investors";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertNotEquals(actualUrl, expectedUrl, "URL beklenen URL ile eşleşiyor.");
        extentTest.pass("Admin URL'in değişmediğini doğrular");
    }

    public static void getYatirimciDuzenleme() {
        IsmailPage ismailPage = new IsmailPage();
        WebElement enSonEklenenProje = Driver.getDriver()
                .findElement(By.xpath("(//tbody/tr[1]/td[7]//*[@class='table-actions']//*[@data-bs-toggle='tooltip'])[1]"));
        enSonEklenenProje.click();

        ismailPage.nameTextbox.clear();
        ismailPage.saveExit.click();

        Assert.assertTrue(ismailPage.nameHataMesaji.isDisplayed(), "Hata mesajı görünmüyor.");

        String expectedMesaj = "The name field is required.";
        String actualMesaj = ismailPage.nameHataMesaji.getText();
        Assert.assertEquals(actualMesaj, expectedMesaj, "Hata mesajı beklenenle eşleşmiyor.");

        String expectedUrl = "https://qa.hauseheaven.com/admin/real-estate/investors";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertNotEquals(actualUrl, expectedUrl, "URL beklenen URL ile eşleşiyor.");
    }

    public static void getTurler() {
        List<WebElement> turler = Driver.getDriver().findElements(By.xpath("//tbody/tr[*]"));
        for (WebElement each : turler){
            Assert.assertTrue(each.isDisplayed());
        }
        extentTest.pass("Admin mevcut türleri görüntüler");
    }

    public static void getTurEkleme(String name, String code , String slug , String order) {
        IsmailPage ismailPage = new IsmailPage();
        Actions actions = new Actions(Driver.getDriver());

        ismailPage.createButonu.click();
        extentTest.pass("Admin Create butonuna basar");
        ismailPage.nameTextbox.sendKeys(name);
        extentTest.pass("Admin Name textbox'a belirlenmiş name yazar");
        ismailPage.codeTextbox.sendKeys(code);
        extentTest.pass("Admin Code textbox'a belirlenmiş code yazar");
        ismailPage.slugTextbox.sendKeys(slug);
        extentTest.pass("Admin Slug textbox'a belirlenmiş slug yazar");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(order).perform();
        extentTest.pass("Admin Order textbox'a belirlenmiş order yazar");
        ReusableMethods.bekle(1);
        ismailPage.saveExit.click();
        extentTest.pass("Admin Save & Exit butonuna basar");
    }

}

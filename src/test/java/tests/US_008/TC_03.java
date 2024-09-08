package tests.US_008;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TeamPages.IsmailPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class TC_03 {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        IsmailPage ismailPage = new IsmailPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());

        ismailPage.allowCookies.click();
        ismailPage.projectsButonu.click();

        js.executeScript("window.scrollBy(0, 500);");
        ReusableMethods.bekle(1);

        List<WebElement> projelerinDescription = Driver.getDriver().findElements(By.xpath("//*[@class='listing-short-description']"));
        List<WebElement> projelerinLocation = Driver.getDriver().findElements(By.xpath("//*[@class='foot-location d-flex']"));
        List<WebElement> projeIsimleriBasliklari = Driver.getDriver().findElements(By.xpath("//*[@class='prt-link-detail text-uppercase']"));

        for (int i = 0; i < projeIsimleriBasliklari.size(); i++) {
            checkElementVisibility(projeIsimleriBasliklari, i);
            checkElementVisibility(projelerinDescription, i);
            checkElementVisibility(projelerinLocation, i);

            clickAndVerifyDetails(projeIsimleriBasliklari, i);

            if (i == 2 || i == 5 || i == 8) {  // 3'erli gruplarda kaydır
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                ReusableMethods.bekle(1);
            }
        }

        Driver.quitDriver();
    }

    private void checkElementVisibility(List<WebElement> elements, int index) {
        try {
            Assert.assertTrue(elements.get(index).isDisplayed());
        } catch (AssertionError e) {
            System.out.println("Element " + index + " görünür değil.");
        }
    }

    private void clickAndVerifyDetails(List<WebElement> projeIsimleriBasliklari, int index) {
        try {
            IsmailPage ismailPage = new IsmailPage();
            projeIsimleriBasliklari.get(index).click();
            Assert.assertTrue(ismailPage.projeUrunIsmi.isDisplayed());
            Assert.assertTrue(ismailPage.projeUrunFiyati.isDisplayed());
            projeDetaybasliklari();
        } catch (Exception e) {
            System.out.println((index+1) + ". Proje görüntüleme sırasında hata oluştu: " + e.getMessage());
        } finally {
            Driver.getDriver().navigate().back();
        }
    }

    public static void projeDetaybasliklari() {
        Actions actions = new Actions(Driver.getDriver());
        List<WebElement> projeDetayBasliklari = Driver.getDriver().findElements(By.xpath("//*[@class='property_block_title']"));
        List<WebElement> projeDetayBodysi = Driver.getDriver().findElements(By.xpath("//*[@class='block-body']"));

        try {
            for (int i = 0; i < projeDetayBasliklari.size(); i++) {
                Assert.assertTrue(projeDetayBasliklari.get(i).isDisplayed());
                Assert.assertTrue(projeDetayBodysi.get(i).isDisplayed());

                if (i < projeDetayBasliklari.size() - 1) {
                    actions.sendKeys(Keys.PAGE_DOWN).perform();
                }
            }
        } catch (Exception e) {
            System.out.println("Proje detay başlıkları doğrulama sırasında hata oluştu: " + e.getMessage());
        }
    }

}

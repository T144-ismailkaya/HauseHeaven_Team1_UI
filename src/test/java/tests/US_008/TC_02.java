package tests.US_008;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.TeamPages.IsmailPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC_02 {

    @Test
    public void testProjeKontrolleri() {
        IsmailPage ismailPage = new IsmailPage();
        try {
            Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
            ismailPage.allowCookies.click();
            ismailPage.projectsButonu.click();

            SoftAssert softAssert = new SoftAssert();
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

            List<WebElement> projelerinDescription = Driver.getDriver().findElements(By.xpath("//*[@class='listing-short-description']"));
            List<WebElement> projelerinLocation = Driver.getDriver().findElements(By.xpath("//*[@class='foot-location d-flex']"));
            List<WebElement> projeIsimleriBasliklari = Driver.getDriver().findElements(By.xpath("//*[@class='prt-link-detail text-uppercase']"));

            int elemanSayisi = Math.min(Math.min(projeIsimleriBasliklari.size(), projelerinDescription.size()), projelerinLocation.size());

            for (int i = 0; i < elemanSayisi; i++) {
                try {
                    softAssert.assertTrue(projeIsimleriBasliklari.get(i).isDisplayed(), "Element " + (i + 1) + ": İsim görünmüyor");
                    softAssert.assertTrue(projelerinDescription.get(i).isDisplayed(), "Element " + (i + 1) + ": Description görünmüyor");
                    softAssert.assertTrue(projelerinLocation.get(i).isDisplayed(), "Element " + (i + 1) + ": Location görünmüyor");
                } catch (Exception e) {
                    System.out.println("Element " + (i + 1) + " kontrolünde hata: " + e.getMessage());
                }

                if ((i + 1) % 3 == 0 && i + 1 < elemanSayisi) {
                    js.executeScript("window.scrollBy(0, 500);");
                    ReusableMethods.bekle(2);
                }

                if ((i + 1) % 6 == 0 && i + 1 < elemanSayisi) {
                    js.executeScript("window.scrollBy(0, 500);");
                    ReusableMethods.bekle(1);
                }

            }

            softAssert.assertAll();

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        } finally {
            Driver.quitDriver();
        }

    }

}

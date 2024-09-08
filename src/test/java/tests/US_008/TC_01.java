package tests.US_008;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TeamPages.IsmailPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class TC_01 extends TestBaseRapor {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        IsmailPage ismailPage = new IsmailPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        ismailPage.allowCookies.click();
        ismailPage.projectsButonu.click();

        String projeString = ismailPage.projeSayisiElementi.getText();

        projeString = projeString.replaceAll("\\D","");
        projeString = projeString.substring(projeString.length() - 1);
        int projeSayisi = Integer.parseInt(projeString);

        Assert.assertTrue(ismailPage.projeSayisiElementi.isDisplayed());

        js.executeScript("window.scrollBy(0, 300);");

        List<WebElement> projeIsimleriBasliklari = Driver.getDriver().findElements(By.xpath("//*[@class='prt-link-detail text-uppercase']"));
        List<String> stringList = ReusableMethods.getStringList(projeIsimleriBasliklari);

        int expectedSayi = projeSayisi;
        int actualSayi = stringList.size();

        Assert.assertEquals(actualSayi, expectedSayi);

        Driver.quitDriver();
    }

}

package tests.US_008;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

public class TC_04 {

    @Test
    public void test03() {

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        IsmailPage ismailPage = new IsmailPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());

        ismailPage.allowCookies.click();
        ismailPage.projectsButonu.click();

        Select select =new Select(ismailPage.countryDropbox);
        select.selectByVisibleText("Azerbaycann");

        ismailPage.stateDropbox.click();
        String stateIsmi = "No results found";
        String actualIsim = ismailPage.elementBulunmuyor.getText();
        Assert.assertEquals(stateIsmi,actualIsim);

        wait.until(ExpectedConditions.visibilityOf(ismailPage.categoryDropbox));
        ismailPage.cityDropbox.click();
        String cityIsmi = "No results found";
        String actualCityIsim = ismailPage.elementBulunmuyor.getText();
        Assert.assertEquals(cityIsmi,actualCityIsim);

        Select categorySelect = new Select(ismailPage.categoryDropbox);
        categorySelect.selectByIndex(4);

        ismailPage.searchButonu.click();

        js.executeScript("window.scrollBy(0, 300);");

        List<WebElement> sonucProjeListi = Driver.getDriver().findElements(By.className("prt-types"));
        List<String> sonucIsimleri = ReusableMethods.getStringList(sonucProjeListi);

        for (String each : sonucIsimleri){
            each.equals("House");
        }

        WebElement element = Driver.driver.findElement(By.xpath("(//*[@class='foot-location d-flex'])[1]"));
        Assert.assertEquals(element,"Azerbaycann");

        Driver.quitDriver();
    }

}

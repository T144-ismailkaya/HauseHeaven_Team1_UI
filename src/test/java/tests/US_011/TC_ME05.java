package tests.US_011;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_ME05 {
    @Test

    public void merve(){



        HomePage homePage=new HomePage();
        Actions actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());
        homePage.contactlinkibutonu.click();
        Assert.assertTrue(homePage.contactreachuselementi.isDisplayed());


        //Levent  Yol
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[contains(@src, 'maps')]"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", iframe);
        Driver.getDriver().switchTo().frame(iframe);

        WebElement map = Driver.getDriver().findElement(By.xpath("//body"));
        ReusableMethods.hover(map);
        ReusableMethods.wait(3);
        actions.click(map).perform();
        actions.click(map).perform();
        actions.click(map).perform();




        //   Driver.getDriver().switchTo().frame(harita);
        // ReusableMethods.hover(homePage.contactsingontoday);
        // ReusableMethods.bekle(2);
        // Driver.getDriver().switchTo().frame(homePage.contcatiframe);
        // homePage.contcatiframe.click();
        // homePage.contcatiframe.click();
        // homePage.contcatiframe.click();
        // homePage.contcatiframe.click();
        //actions.doubleClick(homePage.contactharitagoruntule).perform();
    }
}

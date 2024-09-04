package tests.US_MI009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TC_MI001 {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage();

        Assert.assertTrue(homePage.agentsButonu.isDisplayed());
        Driver.getDriver().quit();
    }

}

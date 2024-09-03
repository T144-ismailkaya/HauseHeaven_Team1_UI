package tests.US_MI009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TC_MI002 {

    @Test
            public void test02(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        HomePage homePage = new HomePage();

        homePage.agentsButonu.click();

        String ExceptedAgentsUrl = "https://qa.hauseheaven.com/agents";
        String ActualAgentsUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(ActualAgentsUrl,ExceptedAgentsUrl);

        Driver.getDriver().quit();

    }

}

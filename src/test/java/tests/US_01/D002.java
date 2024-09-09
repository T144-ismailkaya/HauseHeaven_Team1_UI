package tests.US_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class D002 {
    WebDriver driver;
    @Test
    public void testChromeDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        // 1. Ziyaretçi Hause Heaven URL'ini girer
        driver.get("https://www.hauseheaven.com");
    }

    @Test
    public void testEdgeDriver() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        // 1. Ziyaretçi Hause Heaven URL'ini girer
        driver.get("https://www.hauseheaven.com");
    }
    @AfterMethod
    public void tearDown() {
        // 4. Sekmeyi kapat
        if (driver != null) {
            driver.quit(); // Tarayıcıyı kapatır
        }
}
}
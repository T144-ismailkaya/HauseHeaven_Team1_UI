package tests.US_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class D001 {


        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.manage().window().maximize();
        }

        @Test
        public void testHauseHeaven() {
            // 1. Ziyaretçi Hause Heaven URL'ini girer
            driver.get("https://www.hauseheaven.com");

            // 2. Ziyaretçi title'in "Hause Heaven" olduğunu doğrular
            String expectedTitle = "Hause Heaven";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Sayfa başlığı beklenenden farklı!");

            // 3. Anasayfadaki header kısmının görünürlüğü doğrulanır
            WebElement header = driver.findElement(By.cssSelector("a[href='https://www.hauseheaven.com/projects']"));
            Assert.assertTrue(header.isDisplayed(), "Header görünür değil!");

        }

        @AfterMethod
        public void tearDown() {
            // 4. Sekmeyi kapat
            if (driver != null) {
                driver.quit(); // Tarayıcıyı kapatır
            }
        }
    }




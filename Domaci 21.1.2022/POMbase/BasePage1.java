package Domaci.POMbase;

import Domaci.POMpages.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage1 {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ProductPage productPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        productPage = new ProductPage(driver, wdwait);
    }

    @AfterClass
    public void tearDown() {
//        driver.manage().deleteAllCookies();
//        driver.close();
//        driver.quit();
    }
}

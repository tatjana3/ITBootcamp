package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com/");

        new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement search = driver.findElement(By.name("search_query"));

        String videoNaslov = "Rick Astley - Never Gonna Give You Up (Official Music Video)";

        new WebDriverWait(driver, Duration.ofSeconds(10));
        search.sendKeys(videoNaslov);

        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        Thread.sleep(2000);

        List<WebElement> videos = driver.findElements(By.id("video-title"));
        Thread.sleep(2000);
        for(WebElement video : videos) {
            if (video.getAttribute("title").equals(videoNaslov)) {
                video.click();
                break;
            }
        }

        Thread.sleep(220000); //duzina pesme plus koji sekund vise

        driver.close();
        driver.quit();
    }
}

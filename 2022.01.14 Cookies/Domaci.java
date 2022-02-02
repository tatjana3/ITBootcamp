package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci {
    public static void main(String[] args) throws InterruptedException {
        /*Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica,
         izlogovati se i asertovati da je korisnik izlogovan*/


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/login");

        Cookie kolacic2 = new Cookie ("userID", "73f504cc-65f0-4be7-ac3b-67f8cf18a73d");
        driver.manage().addCookie(kolacic2);

        Cookie kolacic3 = new Cookie ("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRhdGphbmEiLCJwYXNzd29yZCI6IlF3ZXJ0eTEyISIsImlhdCI6MTY0MjM1MjU0OX0.6vfDs5UWw0pm3eMCOGzE6x9F0A0s5o-Rhh7KDjmuggg");
        driver.manage().addCookie(kolacic3);

        Cookie kolacic4 = new Cookie("expires", "2022-01-23T17%3A02%3A29.039Z");
        driver.manage().addCookie(kolacic4);

        driver.navigate().refresh();

        Thread.sleep(2000);

        WebElement profile = driver.findElement(By.xpath("//a[@href='/profile']"));
        Thread.sleep(2000);
        profile.click();

        WebElement logoutButton = driver.findElement(By.id("submit"));
        logoutButton.click();

        String actualURL = driver.getCurrentUrl();
        String expectedURl = "https://demoqa.com/login";

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        Assert.assertEquals(expectedURl,actualURL);
        Assert.assertEquals(expectedTitle,actualTitle);

        driver.close();
        driver.quit();



    }


}

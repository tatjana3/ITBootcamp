package Domaci.POMtest;

import Domaci.POMbase.BasePage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TestProductPage extends BasePage1 {
    @BeforeMethod
    public void setupPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test(priority = 10)
    public void TestProductPage() throws InterruptedException {
        productPage.ispisiProizvodePoKategoriji();
    }
    @Test
    public void dodavanjeUKorpu() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> proizvodi = driver.findElements(By.className("hrefch"));

        int brojac = 1;

        for (WebElement element : proizvodi) {
            if (brojac == 3) {
                break;
            }
            element.click();
            Thread.sleep(2000);

            WebElement addButton = driver.findElement(By.className("btn-success"));
            addButton.click();

            Thread.sleep(2000);
            driver.switchTo().alert().accept();

            driver.navigate().back();
            Thread.sleep(2000);

            brojac++;
        }
    }
}

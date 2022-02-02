package Domaci.POMbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Categories {
    public WebDriverWait wdwait;
    public WebDriver driver;
    public WebElement phones;
    public WebElement laptops;
    public WebElement monitors;

    public Categories(WebDriverWait wdwait, WebDriver driver) {
        this.wdwait = wdwait;
        this.driver = driver;
    }

    public WebElement getPhones() {
        return driver.findElement(By.linkText("Phones"));
    }

    public WebElement getLaptops() {
        return driver.findElement(By.linkText("Laptops"));
    }

    public WebElement getMonitors() {
        return driver.findElement(By.linkText("Monitors"));
    }
    //----------------------------------------------------------------

    public void clickPhones(){
        this.phones.click();
    }

    public void clickLaptops(){
        this.laptops.click();
    }

    public void clickMonitors(){
        this.monitors.click();
    }
}
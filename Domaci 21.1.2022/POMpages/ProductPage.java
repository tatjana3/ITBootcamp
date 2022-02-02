package Domaci.POMpages;

import Domaci.Klase.Kategorija;
import Domaci.Klase.Proizvod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage {
    private WebDriver driver;
    public WebDriverWait wdwait;

    public ProductPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getCategories(){
        return driver.findElements(By.id("itemc"));
    }
    public List<WebElement> getProducts(){
        return driver.findElements(By.className("card"));
    }

    //--------------------------------------------------------

    public void ispisiProizvodePoKategoriji () throws InterruptedException {
        List<WebElement> kategorije = getCategories();
        ArrayList<Kategorija> kategorijaKlasa = new ArrayList<Kategorija>();

        //StringBuilder sb = new StringBuilder();
        for (WebElement kategorija : kategorije){
            String name = kategorija.getText();
            //sb.append(name).append("\n");
            Kategorija k = new Kategorija(name);

            kategorija.click();
            Thread.sleep(2000);
            //wdwait.withTimeout(Duration.ofSeconds(10));

            List<WebElement> products = getProducts();
            for (WebElement prozvoid : products){

                wdwait.withTimeout(Duration.ofSeconds(10));
                String naslov = prozvoid.findElement(By.className("hrefch")).getText();
                String cenaSTR = prozvoid.findElement(By.tagName("h5")).getText();
                double cena = Double.parseDouble(cenaSTR.substring(1, cenaSTR.length()));
                String opis = prozvoid.findElement(By.id("article")).getText();

                wdwait.withTimeout(Duration.ofSeconds(10));
//                sb.append("\tnaziv: ").append(naslov).append("\n");
//                sb.append("\topis: ").append(opis).append("\n");
//                sb.append("\tcena: ").append(cena).append("\n");
//                sb.append("\t-----------------------------------");

                wdwait.withTimeout(Duration.ofSeconds(10));
                Proizvod p = new Proizvod(naslov,opis,cena);
                k.addToProizvod(p);
//                System.out.println("Prolaz");
            }
            wdwait.withTimeout(Duration.ofSeconds(10));
            kategorijaKlasa.add(k);

        }

        //wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //System.out.println(sb.toString());
        for (Kategorija k : kategorijaKlasa){
            System.out.println(k.toString());
        }
    }
}

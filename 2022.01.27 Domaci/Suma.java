package Domaci;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Suma {
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        excelReader = new ExcelReader("C:\\Users\\Sale\\IdeaProjects\\Selenium\\src\\test\\java\\Domaci\\domaci.xlsx");
    }
    @Test
    public void suma(){

        int suma = 0;
        for(int i = 0; i<=excelReader.getLastRow("Brojevi");i++){
            int brojevi = excelReader.getIntegerData("Brojevi",i,0);
            suma += brojevi;
        }

        System.out.println("Suma svih brojeva je: " + suma);
    }
}

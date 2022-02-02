package Domaci.Klase;

import java.util.ArrayList;

public class Kategorija {
    private String name;
    private ArrayList<Proizvod> products;

    public Kategorija(String name) {
        this.name = name;
        this.products = new ArrayList<Proizvod>();
    }

    public ArrayList<Proizvod> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void addToProizvod(Proizvod p) {
        products.add(p);
    }

    public double ukupnaCenaSvihProizvoda() {
        double suma = 0;

        for (Proizvod p : products) {
            suma += p.getCena();
        }

        return suma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");

        int brojac = 1;
        for(Proizvod p : products) {
            sb.append("\nProizvod ").append(brojac).append(":\n");
            sb.append(p.toString());
            brojac++;
        }
        sb.append("\nUkupno stavki iz ").append(name).append(" = ").append(products.size()).append("\n");
        sb.append("Ukupna cena svih proizvoda iz ").append(name).append(" = ").append(ukupnaCenaSvihProizvoda()).append("\n");
        sb.append("\n");
        return sb.toString();
    }
}

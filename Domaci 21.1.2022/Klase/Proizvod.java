package Domaci.Klase;

public class Proizvod {
    private String naziv;
    private String opis;
    private double cena;

    public Proizvod(String naziv, String opis, double cena) {
        this.naziv = naziv;
        this.opis = opis;
        this.cena = cena;
    }

    public double getCena() {
        return this.cena;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tnaziv: ").append(naziv).append("\n");
        sb.append("\topis: ").append(opis).append("\n");
        sb.append("\tcena: ").append(cena).append("\n");
        sb.append("\t-----------------------------------");
        return sb.toString();
    }
}

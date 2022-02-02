package Domaci.Automobil;

public class Automobil {
    /*vozilo  - Napisati klasu Automobil. Automobil ima
    1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
    2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
    3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
    Automobil moze da ima
    4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku*/

    private String marka;
    private String model;
    private int serijskiBroj;
    private Osoba vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }
    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }
    public Osoba getVlasnik(){
        return vlasnik;
    }
    public void setVlasnik (Osoba vlasnik){
        this.vlasnik = vlasnik;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka automobila je: ");
        sb.append(marka);
        sb.append("\n");

        sb.append("Model automobila je: ");
        sb.append(model);
        sb.append("\n");

        sb.append("Serijski broj automobila je: ");
        sb.append(serijskiBroj);
        sb.append("\n");

        if(vlasnik != null){
            sb.append("Vlasnik automobila je: ");
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");
        }
        else {
            sb.append("Automobil nema vlasnika");
            sb.append("\n");
        }

        return sb.toString();
    }
}

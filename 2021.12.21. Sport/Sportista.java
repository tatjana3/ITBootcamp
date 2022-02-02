package Domaci.Sport;

public class Sportista {
    /* sport - Napisati klasu Sportista. Sportista ima
    1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
    2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
    3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
    4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.*/


    private String ime;
    private String prezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String ime,String prezime,String sport, String klub, int brojDresa){
        this.ime = ime;
        this.prezime = prezime;
        this.sport = sport;
        this.klub = klub;

        this.brojDresa = brojDresa;

    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBrojDresa(int brojDresa) {
        if(brojDresa<0){
            System.out.println("Broj ne moze biti negativan!");
        }
        else {
            this.brojDresa = brojDresa;
        }
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojDresa() {
        return brojDresa;
    }
    public String promenaKluba (String n){
        klub = n;
        return klub;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime sportiste je: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime sportiste je: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Sport sportiste je: ");
        sb.append(sport);
        sb.append("\n");

        sb.append("Klub u kojem sportista igra je: ");
        sb.append(klub);
        sb.append("\n");

        sb.append("Broj dresa sportiste je: ");
        if (brojDresa<0){
            sb.append("Broj ne moze biti negativan!");
            sb.append("\n");
        }
        else {
            sb.append(brojDresa);
            sb.append("\n");
        }

        return sb.toString();
    }

}

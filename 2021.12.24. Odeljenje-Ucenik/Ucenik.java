package Domaci;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {

        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }
    public Ucenik(String ime, String prezime) {

        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Integer>();
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public ArrayList<Integer> getOcene() {
        return this.ocene;
    }

    public double prosek()
    {
        double prosek = 0;
        int prolaz = 0;

        for (Integer i : this.ocene) {
            prosek += i;
            prolaz++;
        }

        prosek = prosek / prolaz;
        return prosek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ime);
        sb.append(" ");
        sb.append(this.prezime);
        sb.append(" ima ocene: ");

        for (Integer i : this.ocene) {
            sb.append(i);
            sb.append(", ");
        }

        return sb.toString();
    }
}

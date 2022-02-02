package Domaci;

import java.util.ArrayList;
import java.util.Locale;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        this.dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        this.dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        this.dnevnik.remove(u);
    }

    public void ispisiUcenika(int i) {
        this.dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u) {
        System.out.println(u.toString());
    }

    public void pogledajOcene(int i) {
        Ucenik u = this.dnevnik.get(i);
        System.out.println(u.toString());
    }

    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());
    }

    public void prosecnaOcena(int i) {
        Ucenik u = this.dnevnik.get(i);
        System.out.println(u.prosek());
    }

    public double prosecnaOcenaOdeljenja() {
        if (this.dnevnik.size() == 0) {
            return 0;
        }

        double prosek = 0;
        int prelaz = 0;

        for(Ucenik u : this.dnevnik) {
            prosek += u.prosek();
            prelaz++;
        }

        return prosek / prelaz;
    }

    public String opisnaOcena(Ucenik u) {
        double prosek = u.prosek();
        if (prosek >= 4.5) {
            return "Odlican";
        } else if(prosek >= 3.5 && prosek < 4.5) {
            return "Vrlo dobar";
        } else if(prosek >= 2.5 && prosek < 3.5) {
            return "Dobar";
        } else if(prosek >= 1.5 && prosek < 2.5) {
            return "Dovoljan";
        } else {
            return "Nedovoljan";
        }
    }

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik u : this.dnevnik) {
            sb.append(u.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public String velicinaOdeljenja() {
        if (this.dnevnik.size() >= 25) {
            return "Veliko odeljenje";
        } else if(this.dnevnik.size() >= 15 && this.dnevnik.size() < 25) {
            return "Srednje odeljenje";
        } else {
            return "Malo odeljenje";
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.oznaka);
        sb.append("odeljenja ima djake: \n");

        for(Ucenik u : this.dnevnik) {
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");
        }

        return sb.toString();
    }
}

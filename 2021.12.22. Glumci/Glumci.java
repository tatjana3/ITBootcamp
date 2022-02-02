package Domaci.Glumci;

public class Glumci {
    //1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
    // pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i da li je iz Srbije
    // odgovorite preko booleana. Sve potrebno za glumca i glumicu da budu dva ispisa
    private String imeGlumca;
    private String prezimeGlumca;
    private char pol;
    private int godine;
    private double ocena;
    private boolean izSrbije;

    public Glumci(String imeGlumca, String prezimeGlumca, char pol, int godine, double ocena,
                  boolean izSrbije) {
        this.imeGlumca = imeGlumca;
        this.prezimeGlumca = prezimeGlumca;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.izSrbije = izSrbije;
    }

    public String getImeGlumca() {
        return imeGlumca;
    }

    public void setImeGlumca(String imeGlumca) {
        this.imeGlumca = imeGlumca;
    }

    public String getPrezimeGlumca() {
        return prezimeGlumca;
    }

    public void setPrezimeGlumca(String prezimeGlumca) {
        this.prezimeGlumca = prezimeGlumca;
    }

    public char getPol() {
        return pol;
    }


    public void setPol(char pol) {
        if (pol == 'z'){
            this.pol = pol;
        }
        else if (pol == 'm') {
            this.pol = pol;
        }
        else{
            System.out.println("Uneli ste pogresan karakter");
        }
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if (godine<0){
            System.out.println("Glumac/ica ne postoji");
        }
        else {
            this.godine = godine;
        }
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        if (ocena<=0){
            this.ocena = 0;
        }else {
            this.ocena = ocena;
        }
    }

    public boolean getIzSrbije() {
        return izSrbije;
    }

    public void setIzSrbije(boolean izSrbije) {
        this.izSrbije = izSrbije;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime glumca/ice je: ");
        sb.append(imeGlumca);
        sb.append(" ");

        sb.append("Prezime glumca/ice je: ");
        sb.append(prezimeGlumca);
        sb.append(" ");

        sb.append("Pol glumca/ice je: ");
        sb.append(pol);
        sb.append(" ");

        sb.append("Godine glumca/ice je: ");
        if (godine<0){
            sb.append("Glumac/ica ne postoji!");
        }else {
            sb.append(godine);
            sb.append(" ");
        }

        sb.append("Vasa ocena glumca/ice je: ");
        if (ocena<0){
            sb.append("Ocena ne moze biti manja od 0");
        }else {
            sb.append(ocena);
            sb.append(" ");
        }

        sb.append("Glumac/ica je iz Srbije: ");
        sb.append(izSrbije);
        sb.append(" ");

        return sb.toString();

    }
}

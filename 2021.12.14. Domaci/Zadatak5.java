package Domaci;

public class Zadatak5 {
    public static void main(String[] args) {
        /*31. Napisati funkciju koja racuna proizvod 3 broja.
Hint kako citati ove zadatke:
- ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
- funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)*/

       int resenje = proizvod(8,-2,6);
        System.out.println("Proizvod unesena tri broja je " + resenje);
    }

    public static int proizvod (int a, int b,int c){
        int mnozenje = a*b*c;

        return mnozenje;
    }



}

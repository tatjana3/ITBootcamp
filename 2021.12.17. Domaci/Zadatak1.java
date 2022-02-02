package Domaci;

public class Zadatak1 {
    public static void main(String[] args) {
        //41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        double[] niz = {12,4,43,12,-12.76,45,79};
        System.out.println("Prosecna vednost niza je: " + prosecnaVrednost(niz));

    }
    public static double prosecnaVrednost (double[] a){
        double avg = 0;
        double suma = 0;
        for (int i = 0; i<a.length; i++){
            suma+=a[i];
        }
        avg = suma/a.length;
        return avg;
    }
}

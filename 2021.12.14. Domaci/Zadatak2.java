package Domaci;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*28. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
              Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
          28* Napraviti funkciju koja vraca sumu prosledjenog niza.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite zeljenu duzinu niza: ");
        int n = sc.nextInt();
        int [] niz = new int [n];

        System.out.println("Unesite clanove niza: ");
        for (int i = 0; i<niz.length;i++){
            niz[i] = sc.nextInt();
        }

        int suma = izracunajSumu(niz);
        System.out.println("Suma je: " + suma);
    }

    public static int izracunajSumu(int[] niz) {
        int suma = 0;

        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }

        return suma;
    }
}

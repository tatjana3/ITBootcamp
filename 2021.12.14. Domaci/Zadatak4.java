package Domaci;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
       // 30. -//-. Izracunati proizvod elemenata tog niza.
       //         Primer: [2, 4] -> 8
       // 30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite zeljenu duzinu niza: ");
        int n = sc.nextInt();
        int [] niz = new int [n];

        System.out.println("Unesite clanove niza: ");
        for (int i =0; i<n;i++){
            niz[i] = sc.nextInt();
        }

        int proizvod = izracunajProizvod(niz);
        System.out.println("Proizvod svih clanova niza je: " + proizvod);
    }

    public static int izracunajProizvod(int[] niz) {
        int proizvod = 1;

        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }

        return proizvod;
    }
}

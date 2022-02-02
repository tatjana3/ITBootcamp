package Domaci;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
       /* 27.   Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
                Ispisati svaki drugi element tog niza
       *Primer: [1, 2, 3, 4, 5] -> 1 3 5
          27*   Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite zeljenu duzinu niza: ");
        int n = sc.nextInt();
        int[] niz = new int [n];

        System.out.println("Unesite brojeve: ");
        for (int i = 0; i < n; i++)
        {
            niz[i] = sc.nextInt();
        }

        ispisiSvakiDrugi(niz);
    }

    public static void ispisiSvakiDrugi(int[] niz) {
        for (int i = 0; i<niz.length; i++){
            if(i%2!=0){
                System.out.println("Drugi element je: " + niz[i]);
            }
        }
    }
}
package Domaci;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*29. -//-. Ispisati svaki treci element u obrnutom redosledu.
                Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.*/
        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8};

        ispisiSvakiTreciObrnuto(niz);

    }

    public static void ispisiSvakiTreciObrnuto(int[] niz) {
        int brojPrelaza = 0;
        for (int i = niz.length - 1; i >= 0; i--) {
            if (brojPrelaza % 3 == 0) {
                System.out.println(niz[i]);
            }
            brojPrelaza++;
        }
    }
}

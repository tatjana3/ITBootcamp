/*
Grananja2: Sintaksa1 uraditi ponovo, koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
(kakvi celi brojevi moraju da budu visina, sirina i duzina?)
 */

import java.util.Scanner;

public class Grananje2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite stranicu a:");
        double a =sc.nextDouble();

        System.out.println("Unesite stranicu b:");
        double b = sc.nextDouble();

        boolean postojiGreska = false;

        if (a<1) {
            System.out.println("Greska u stranici a, ne sme da bude manja od 1");
            postojiGreska=true;
        }

        if (b<1) {
            System.out.println("Greska u stranici b, ne sme da bude manja od 1");
            postojiGreska=true;
        }

        if (!postojiGreska) {
            double povrsina= a * b;

            System.out.println(povrsina);
        }
    }
}

/*
Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice
prostorije ucitavaju preko konzole. (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 */

import java.util.Scanner;

public class Sintaksa1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite stranicu a:");
        double a =sc.nextDouble();

        System.out.println("Unesite stranicu b:");
        double b = sc.nextDouble();

		double povrsina= a * b;

		System.out.println(povrsina);
    }
}

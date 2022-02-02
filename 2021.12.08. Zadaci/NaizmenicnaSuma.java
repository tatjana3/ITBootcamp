import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {
    /*3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
    Na standardni izlaz ispisati resenje izraza:
    1 - 2 + 3 - .... (+/-) */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ceo broj");
        int broj = sc.nextInt();
        int rezultat = 0;
        for (int i =0;i<=broj;i++){
            rezultat -= i;

            if (i<broj) {
                i++;
                rezultat += i;
            }

        }
        System.out.println("Rezultat je: " + rezultat);
    }
}

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {
/*2.Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n]. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite 2 broja, prvi broj mora biti manji ili jednak drugom broju: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int suma = 0;
        for (int i=a;i>=a && i<=b;i++){
            suma += i;

        }
        System.out.println("Suma unetih brojeva je: " + suma);
    }
}

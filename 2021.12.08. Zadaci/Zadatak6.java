import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        //6. Ispisati proizvod prvih n celih brojeva [1, n].

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int a = sc.nextInt();

        int proizvod = 1;

        for (int i=1 ; i<=a ; i++){

            proizvod *= i;
        }
        System.out.println(proizvod);
    }
}

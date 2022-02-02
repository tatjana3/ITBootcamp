import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {
    /*1.Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
    n!! = n * (n-2) * (n-4) * ... * (2 ili 1)*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();

        int dupliFaktorijel = 1;
        for (int i=broj; i>=1;i-=2){

            dupliFaktorijel *= i;
        }
        System.out.println("Dupli faktorijel je: " + dupliFaktorijel);

    }
}

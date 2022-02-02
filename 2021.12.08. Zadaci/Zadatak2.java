import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je
         strogo manji od 0 ili "Neutralan" ako je tacno 0.
         */

        int brojac = 0;

        /*Dodala sam while petlju iz razloga da bi mi ponovio sve automatski,tj da ne bih morala ponovo da pokrecem
        *konzolu za novi broj i da bih isprobala da li to moze tako da se odradi.*/

        while (brojac<=5){
            Scanner sc =new Scanner(System.in);

            System.out.println("Unesite broj:");
            int a = sc.nextInt();


            if (a>0){
                System.out.println("Pozitivan");
            }
            else if(a<0){
                System.out.println("Negativan");
            }
            else{
                System.out.println("Neutralan");
            }
            brojac++;
        }


    }
}

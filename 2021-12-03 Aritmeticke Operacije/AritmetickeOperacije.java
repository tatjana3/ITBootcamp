import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args) {
        /*Na standardni ulaz se unose dva cela broja.
        Ispisati na standardnom izlazu u zasebnim redovima zbir,
        razliku, proizvod, kolicnik i ostatak deljenja prvog
         broja drugim tim redom.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a= sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();

        int razlika = a-b;
        int zbir = a+b;
        int proizvod = a*b;
        int kolicnik= a/b;
        int ostatak= a%b;
        System.out.println("Zbir unetih brojeva je " + zbir);
        System.out.println("Razlika unetih brojeva je " + razlika);
        System.out.println("Proizvod unetih brojeva je " + proizvod);
        System.out.println("Kolicnik unetih brojeva je " + kolicnik);
        System.out.println("Ostatak unetih brojeva je " + ostatak);




    }
}

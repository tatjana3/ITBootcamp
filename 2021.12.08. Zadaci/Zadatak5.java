import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

        Scanner sc= new Scanner(System.in);

        System.out.println("Unesite pozitivan broj: ");
        int a = sc.nextInt();

        int donjaGranica = a-14;
        int gornjaGranica = 2*a;
        System.out.println(donjaGranica);
        for (int i=1 ; i<=a ; i++){
            System.out.println(" " + i + " ");

        }
        System.out.println(gornjaGranica);


    }
}

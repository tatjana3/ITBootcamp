import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

        Scanner sc =new Scanner (System.in);

        System.out.println("Unesite broj: ");
        int a=sc.nextInt();

        for (int i =0;i<=a;i++){
            System.out.println(i);
        }
    }
}

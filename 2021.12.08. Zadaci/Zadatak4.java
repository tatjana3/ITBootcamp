import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite negativan broj: ");
        int a=sc.nextInt();

        for (int i=a ;i<=0;i++){
            System.out.println(i);
        }

    }
}

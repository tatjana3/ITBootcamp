import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz"
        ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        int i=1;
        while (i<=broj){

            System.out.println("");
            System.out.print(i + ": ");

           if(i%3==0 && i%5==0){
               System.out.print("FizzBuzz");
           }
           else if(i%5==0){
               System.out.print("Buzz");
           }
           else if(i%3==0){
               System.out.print("Fizz");
           }
           i++;


        }


    }
}

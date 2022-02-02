import java.util.Locale;
import java.util.Scanner;

public class Grananja3 {

    public static void main(String[] args) {
        System.out.println("Unesite godinu:");
        Scanner s=new Scanner(System.in);
        int godina=s.nextInt();
        System.out.println("Unesite mesec:");
        String mesec=s.next().toLowerCase(Locale.ROOT);

        if (godina%4==0 || godina%100==0) {
//            System.out.println("Broj karaktera za mesec " + mesec.length());
            if(mesec.equals("januar") || mesec.equals("mart") || mesec.equals("decembar" )) {
                System.out.println("Mesec ima 31 dan");
            }
            else if(mesec.equals("april") || mesec.equals("jun") || mesec.equals("septembar" )|| mesec.equals("novembar" )) {
                System.out.println("Mesec ima 30 dana");
            }
            else if(mesec.equals("februar")) {
                System.out.println("Mesec ima 29 dana");
            }
            else {
                System.out.println("Niste uneli tacan unos");
            }

            System.out.println("Godina je prestupna");
        }
        else if(godina%4==1 || godina%100==1 ) {
            if(mesec.equals("januar") || mesec.equals("mart") || mesec.equals("decembar" )) {
                System.out.println("Mesec ima 31 dan");
            }
            else if(mesec.equals("april") || mesec.equals("jun") || mesec.equals("septembar" )|| mesec.equals("novembar" )) {
                System.out.println("Mesec ima 30 dana");
            }
            else if(mesec.equals("februar")) {
                System.out.println("Mesec ima 29 dana");
            }
            else {
                System.out.println("Niste uneli tacan unos");
            }

            System.out.println("Godina nije prestupna");
        }
        else {
            System.out.println("Nista se nije desilo");
        }
    }
}

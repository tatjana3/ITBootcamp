package Domaci.Automobil;

import Domaci.Automobil.Automobil;
import Domaci.Automobil.Osoba;

import java.util.Scanner;

public class Voznja {
    /*    Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
    Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.*/

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Unesite naziv marke prvog automobila: ");
            String marka1 = sc.next();

            System.out.println("Unesite model: ");
            String model1 = sc.next();

            System.out.println("Unesite serijski broj: ");
            int serijskiBroj1 = sc.nextInt();

             System.out.println("Da li postoji vlasnik automobila?");
             String odgovor1 = sc.next();

             if (odgovor1.equals("da")){
                 System.out.println("Unesite ime vlasnika: ");
                 String imeVlasnika1 = sc.next();
                 System.out.println("Unesite prezime vlasnika: ");
                 String prezimeVlasnika1 = sc.next();
                 System.out.println("Unesite godinu rodjenja vlasnika: ");
                 int godinaRodjenjaVlasnika1 = sc.nextInt();
                 System.out.println("Unesite visinu vlasnika: ");
                 double visinaVlasnika1 = sc.nextDouble();

                 Osoba vlasnik1 = new Osoba(imeVlasnika1,prezimeVlasnika1,godinaRodjenjaVlasnika1,visinaVlasnika1);
                 Automobil a1 = new Automobil(marka1, model1,serijskiBroj1,vlasnik1);

                 System.out.println(vlasnik1.getIme() + " " + vlasnik1.getPrezime());
                 System.out.println(a1);
             }
             else{
                 Automobil a1 = new Automobil(marka1, model1,serijskiBroj1);
                 System.out.println(a1);
             }

        System.out.println("Unesite naziv marke drugog automobila: ");
        String marka2 = sc.next();

        System.out.println("Unesite model: ");
        String model2 = sc.next();

        System.out.println("Unesite serijski broj: ");
        int serijskiBroj2 = sc.nextInt();

        System.out.println("Da li postoji vlasnik automobila?");
        String odgovor2 = sc.next();

        if (odgovor2.equals("da")){
            System.out.println("Unesite ime vlasnika: ");
            String imeVlasnika2 = sc.next();
            System.out.println("Unesite prezime vlasnika: ");
            String prezimeVlasnika2 = sc.next();
            System.out.println("Unesite godinu rodjenja vlasnika: ");
            int godinaRodjenjaVlasnika2 = sc.nextInt();
            System.out.println("Unesite visinu vlasnika: ");
            double visinaVlasnika2 = sc.nextDouble();

            Osoba vlasnik2 = new Osoba(imeVlasnika2,prezimeVlasnika2,godinaRodjenjaVlasnika2,visinaVlasnika2);
            Automobil a2 = new Automobil(marka2, model2,serijskiBroj2,vlasnik2);
            System.out.println(vlasnik2.getIme() + " " + vlasnik2.getPrezime());
            System.out.println(a2);
        }
        else{
            Automobil a2 = new Automobil(marka2, model2,serijskiBroj2);
            System.out.println(a2);
        }



    }
}

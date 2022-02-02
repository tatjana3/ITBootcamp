import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        /*8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        *	"Dobrodosao u {x}. razred, {ime} {prezime}",
        *	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak
        *  ispisati jednu odgovarajucu poruku od:
        *	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = sc.next();

        System.out.println("Unesite prezime: ");
        String prezime = sc.next();

        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();

        int godina = 2021 - godinaRodjenja;

        switch (godina){
            case 7:
                System.out.println("Dobrodosli u 1. razred " + ime + " " + prezime);
                break;
            case 8:
                System.out.println("Dobrodosli u 2. razred " + ime + " " + prezime);
                break;
            case 9:
                System.out.println("Dobrodosli u 3. razred " + ime + " " + prezime);
                break;
            case 10:
                System.out.println("Dobrodosli u 4. razred " + ime + " " + prezime);
                break;
            case 11:
                System.out.println("Dobrodosli u 5. razred " + ime + " " + prezime);
                break;
            case 12:
                System.out.println("Dobrodosli u 6. razred " + ime + " " + prezime);
                break;
            case 13:
                System.out.println("Dobrodosli u 7. razred " + ime + " " + prezime);
                break;
            case 14:
                System.out.println("Dobrodosli u 8. razred " + ime + " " + prezime);
                break;
            case 15:
                System.out.println("Dobrodosli u 9. razred " + ime + " " + prezime);
                break;
            case 16:
                System.out.println("Dobrodosli u 10. razred " + ime + " " + prezime);
                break;
            case 17:
                System.out.println("Dobrodosli u 11. razred " + ime + " " + prezime);
                break;
            case 18:
                System.out.println("Dobrodosli u 12. razred " + ime + " " + prezime);
                break;
            default:
                if(godina<7){
                    System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
                }
                else{
                    System.out.println(ime + " " + prezime + " je zavrsio/la skolu");
                }
        }

    }
}

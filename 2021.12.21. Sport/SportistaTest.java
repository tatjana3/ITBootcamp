package Domaci.Sport;



public class SportistaTest {
   /* Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve
    tipove metoda napisanih u klasi Sportista.*/

    public static void main(String[] args) {

        Sportista s1 = new Sportista("Pera","Peric","Kosarka","Crvena Zvezda",34);
        System.out.println(s1);


        s1.promenaKluba("Partizan");
        System.out.println("Novi klub prvog sportiste je: " + s1.getKlub());

        s1.setBrojDresa(22);
        System.out.println("Novi broj dresa je: " + s1.getBrojDresa());

        Sportista s2 = new Sportista("Marko","Markovic","Fudbal","Partizan",26);
        System.out.println(s2);


        s2.promenaKluba("Crvena Zvezda");
        System.out.println("Novi klub prvog sportiste je: " + s2.getKlub());

        s2.setBrojDresa(-33);
        System.out.println("Novi broj dresa je: " + s2.getBrojDresa());


        Sportista s3 = new Sportista("Marija","Maric","Ragbi","Radnicki",-44);
        System.out.println(s3);

        s3.promenaKluba("Crvena Zvezda");
        System.out.println("Novi klub prvog sportiste je: " + s3.getKlub());

        s3.setBrojDresa(33);
        System.out.println("Novi broj dresa je: " + s3.getBrojDresa());



    }
}

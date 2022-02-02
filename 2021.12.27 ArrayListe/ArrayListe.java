package dOMACI2;

import java.util.ArrayList;

public class ArrayListe {
    /*2.    Kreirajte array listu nekog vaseg interesovanje (npr sport)
                -u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
                -iz liste dohvatite 3. element liste i ispisite
                -promenite naziv prvog elementa
                -uklonite 5. element
                -ispisite velicinu vase liste
                -pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste*/

    public static void main(String[] args) {
      ArrayList<String> sport = new ArrayList<>();
      sport.add("Kosarka");
        sport.add("Fudbal");
        sport.add("Ragbi");
        sport.add("Odbojka");
        sport.add("Vaterpolo");
        sport.add("Tenis");

        System.out.println("Treci u nizu je: " + sport.get(2));
        sport.set(0,"Hokej");
        sport.remove(4);
        System.out.println("Velicina niza je: " + sport.size());

        for (int i = 0; i<sport.size();i++){
            System.out.println(sport.get(i));
        }

        for (String element : sport){
            System.out.print(element + " ");
        }


    }



}

package Domaci;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
       // 42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
        String[] imena = {"Jovana","Milos","Sanja","Marijana","Petar","Stefan"};
        System.out.println("Da li postoji: " + postojanje(imena));
    }
    public static boolean postojanje (String[] a){
        for (int i =0; i<a.length; i++){
            boolean pronasao = false;
            if (a[i] == "Marija" || a[i] == "Petar"){
                return true;
            }
        }

        return false;
    }


}

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        //7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite zeljeni mesec i dan: ");
        String mesec = sc.next().toLowerCase();
        int dan = sc.nextInt();

        switch (mesec){
            case "januar":
                if(dan>=1 && dan<=20){
                    System.out.println("Vas horoskopski znak je JARAC");
                }
                else if(dan>=21 && dan<=31){
                    System.out.println("Vas horoskopski znak je VODOLIJA");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "februar":
                if(dan>=1 && dan<=19){
                    System.out.println("Vas horoskopski znak je VODOLIJA");
                }
                else if(dan>=20 && dan<=29){
                    System.out.println("Vas horoskopski znak je RIBE");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "mart":
                if(dan>=1 && dan<=20){
                    System.out.println("Vas horoskopski znak je RIBE");
                }
                else if(dan>=21 && dan<=31){
                    System.out.println("Vas horoskopski znak je OVAN");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "april":
                if(dan>=1 && dan<=20){
                    System.out.println("Vas horoskopski znak je OVAN");
                }
                else if(dan>=21 && dan<=30){
                    System.out.println("Vas horoskopski znak je BIK");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "maj":
                if(dan>=1 && dan<=21){
                    System.out.println("Vas horoskopski znak je BIK");
                }
                else if(dan>=22 && dan<=31){
                    System.out.println("Vas horoskopski znak je BLIZANCI");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "jun":
                if(dan>=1 && dan<=21){
                    System.out.println("Vas horoskopski znak je BLIZANCI");
                }
                else if(dan>=22 && dan<=30){
                    System.out.println("Vas horoskopski znak je RAK");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "jul":
                if(dan>=1 && dan<=22){
                    System.out.println("Vas horoskopski znak je RAK");
                }
                else if(dan>=23 && dan<=31){
                    System.out.println("Vas horoskopski znak je LAV");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "avgust":
                if(dan>=1 && dan<=22){
                    System.out.println("Vas horoskopski znak je LAV");
                }
                else if(dan>=23 && dan<=31){
                    System.out.println("Vas horoskopski znak je DEVICA");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "septembar":
                if(dan>=1 && dan<=22){
                    System.out.println("Vas horoskopski znak je DEVICA");
                }
                else if(dan>=23 && dan<=30){
                    System.out.println("Vas horoskopski znak je VAGA");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "oktobar":
                if(dan>=1 && dan<=23){
                    System.out.println("Vas horoskopski znak je VAGA");
                }
                else if(dan>=24 && dan<=31){
                    System.out.println("Vas horoskopski znak je SKORPIJA");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "novembar":
                if(dan>=1 && dan<=22){
                    System.out.println("Vas horoskopski znak je SKORPIJA");
                }
                else if(dan>=23 && dan<=30){
                    System.out.println("Vas horoskopski znak je STRELAC");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            case "decembar":
                if(dan>=1 && dan<=21){
                    System.out.println("Vas horoskopski znak je STRELAC");
                }
                else if(dan>=22 && dan<=31){
                    System.out.println("Vas horoskopski znak je JARAC");
                }
                else {
                    System.out.println("Uneli ste nepostojeci datum");
                }
                break;
            default:
                System.out.println("Uneli ste nepostojeci mesec");







        }


    }


}

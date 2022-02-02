package dOMACI2;

public class DuplaPetlja {
    /*U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
       (Primer ispisa:
        Week: 1
        Day: 1
        Day: 2
        Day: 3 //sve do Day: 7
        Week: 2
        Day: 1
        Day: 2
        Day: 3.......
        Week: 3
        Day: 1
        Day: 2
        Day: 3......)*/
    public static void main(String[] args) {
        for(int i = 1; i<=3;i++){
            System.out.print("Week: " + i + "\n");
            for(int j = 1; j<=7;j++){
                System.out.println("Day: " + j);
            }

        }
    }


}



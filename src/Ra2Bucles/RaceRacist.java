package Ra2Bucles;

import java.util.Scanner;

public class RaceRacist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 100, gasta = 0;
        
        do {
            String barra = "#";
            System.out.print("|");
            for (int i = 0; i < 20; i++) {
                
                
                if (i >= res / 5 ) {
                    barra = " ";
                }
                System.out.print(barra);
                
            }
            System.out.print("|");
            System.out.println(" ("+res+")");

            do {
                System.out.println("\nCuanta resistencia quieres gastar?");
                gasta = sc.nextInt();
            } while (gasta < 1 || gasta > 20);

            res -= gasta;
            
        } while (res > 0);


    }

}

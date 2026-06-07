package Ra2Bucles;

import java.util.Random;
import java.util.Scanner;

public class Probabilidad3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int numero = 0,op = 0, playerPoints = 0, cpuPoints=0, rounds = 0;
        final int maxGames = 6;

        do {

            //tiramos num aleatorio:
            numero = rnd.nextInt(1, 50+1);
            
            System.out.println("el numero en el que estoy es divisible entre 3?");

            System.out.println("=".repeat(20)+"(1=sí, 0=no)"+"=".repeat(20));
            op = sc.nextInt();

            if (op == 1 && numero %3 == 0) {

                playerPoints++;
                System.out.println("Ganaste un punto (total:"+playerPoints+")");
                
            }else if(op == 0 && numero %3 != 0){

                playerPoints++;
                System.out.println("Ganaste un punto (total:"+playerPoints+")");
                
            }else{

                cpuPoints++;
                System.out.println("yo gano un punto (total: "+cpuPoints+")");
                
            }
            rounds++;
            
            System.out.println("\nPartida num: "+rounds +" - Numero: "+numero +"\nPuntuacion actual: \nP1: "+playerPoints +"\nCPU: "+cpuPoints);
            
        } while (rounds != maxGames && playerPoints < 3 && cpuPoints < 3);

    }

}

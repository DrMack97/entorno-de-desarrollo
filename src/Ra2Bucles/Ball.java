package Ra2Bucles;

import java.util.Random;
import java.util.Scanner;

public class Ball {

    public static void showTotalBall(int totalsteps){
        if(totalsteps > 0){
            for(int i = 0; i < totalsteps; i++){
                System.out.print('=');
            }
            System.out.println();
            for(int i = 0; i < totalsteps - 1 ; i++){
                System.out.print(' ');
            }
            System.out.println('o');
            for(int i = 0; i < totalsteps; i++){
                System.out.print('=');
            }
            System.out.println();
        }else{
            System.out.println("=".repeat(30));
            System.out.println(' ');
            System.out.println("=".repeat(30));
        }

    }


    public static int askSteps(){
        int usrValue = -1;

        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("How many steps?");
            usrValue = sc.nextInt();

            if(usrValue < 1 || usrValue > 5){
                System.out.println("Number of steps wrong, use 1 to 5");
            }


        }while(usrValue < 1 || usrValue > 5);
        
        return usrValue;
    }

    public static int probabilityOfSemaphore(int steps){
        int semaphore = -1;

        Random rd = new Random();

        int prob = rd.nextInt(10);

        if(steps < 4){
            //+ probable green
            if(prob >= 0 && prob <=4 ) semaphore = 0; //0 = green
            else if(prob >= 5 && prob <= 7) semaphore = 1;//1 = yellow
            else semaphore = 2; //2 = red; 

        }else{
            //+ probable red
            if(prob >= 0 && prob <=4 ) semaphore = 2; //2 = red
            else if(prob >= 5 && prob <= 7) semaphore = 1;//1 = yellow
            else semaphore = 0; //0 = green; 
        }


        return semaphore;

    }

    public static int realSteps(int steps, int semaphore){
        int rSteps = -1;

        if(semaphore == 2 ) rSteps = -steps;
        else if(semaphore == 1) rSteps = steps - 2;
        else rSteps = steps;

        return rSteps;
    }

    public static String semaphoreToString(int semaphore){
        String sm = "";
        switch (semaphore) {
            case 0:
                sm = "Green";
                break;
            case 1:
                sm = "Yellow";
                break;
            case 2:
                sm = "Red";
                break;
            default:
                sm = "Unkown";
                break;
        }

        return sm;
    }

    public static void limpiarConsola() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}

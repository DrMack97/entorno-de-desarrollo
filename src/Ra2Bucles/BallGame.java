package Ra2Bucles;
import java.util.Random;
import java.util.Scanner;

public class BallGame {
    public static void main(String[] args) {
        int steps, tries, games = 0, actualPos = 0, maxPos = 0, semaphore= 0, maxTries= 0;
        Random rd = new Random();

        boolean exitGame = false;

        Scanner sc = new Scanner( System.in);

        do{
            System.out.println("Do you want to play a new game?(0 no, 1 yes)");

            int newGame = sc.nextInt();

            if(newGame == 1){
                //NewGame
                System.out.println("New Game!!");
                maxTries = rd.nextInt(5, 10 + 1);
                tries = 0; 
                actualPos = 0;

                for(tries = 0; tries < maxTries; tries++){
                    //New steps
                    //ask steps

                    steps = Ball.askSteps();
                    
                    Ball.limpiarConsola();

                    //probabilitycal
                    semaphore = Ball.probabilityOfSemaphore(steps);
                    //res steps
                    steps = Ball.realSteps(steps, semaphore);
                    //update total 
                    actualPos += steps;
                    //print ball
                    System.out.println(Ball.semaphoreToString(semaphore));
                    System.out.println("Total steps: "+actualPos+" Tries: "+tries);
                    Ball.showTotalBall(actualPos);

                }

                games++;
                System.out.println("End of the game: "+ actualPos);
                if(actualPos > maxPos){
                    System.out.println("New record!!! Points: "+ actualPos);
                    maxPos = actualPos;
                }
                


            }else{
                exitGame = true;
                System.out.println("Bye bye");
            }


        }while(!exitGame);


        
    }
}

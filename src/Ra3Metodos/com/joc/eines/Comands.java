package Ra3Metodos.com.joc.eines;

import java.util.Random;

public class Comands {

        public static void printGame(int pos1, int pos2, char c1, char c2, int maxPos){
            for(int i = 0; i < maxPos; i++){
                if(i == pos1){
                    System.out.print(c1);
                }else if(i == pos2){
                    System.out.print(c2);
                }else{
                    System.out.print('-');
                }
            }
            System.out.println();
        }

        public static int tirarEndavant(){
            Random rd = new Random();
            return rd.nextInt(5,10+1);
        }

        public static boolean sonIguals(int pos1, int pos2){
            return pos1 == pos2;
        }

        public static int quiHaGuanyat(int pos1, int pos2, int maxPos){
            int win = -1;
            if(pos1 >= maxPos){
                win = 1;
            }else if(pos2 >= maxPos){
                win = 2;
            }

            return win;
        }
}

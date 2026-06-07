package Ra2Bucles;

import java.util.Scanner;

public class App3 {
public static void main(String[] args) {

    int maxVida=60, vida = 60; 
    char c = 'x';

    Scanner sc = new Scanner(System.in);


    do{

    for(int i = 0; i < 20; i++){
        if(i < (vida*20)/maxVida ) System.out.print(c);
        else System.out.print(' ');
    }

     System.out.println("("+vida+")");

     System.out.println("Quanta vida treiem?");
     int damage =  sc.nextInt();

     vida -= damage;

  }while(vida > 0);
       
}
}

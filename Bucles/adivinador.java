import java.util.Random;
import java.util.Scanner;

//⦁ Programa donde el ordenador piensa un número (aleatoriamente) entre 1 y 100 y el usuario intenta adivinarlo.
//El programa pedirá de forma iterativa al usuario que entre números e indicará si el número a adivinar es mayor o menor.
//El programa termina cuando el usuario adivina el número y deberá mostrarse el número de intentos que se han utilizado.
public class adivinador {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int Random = r.nextInt(100 - 1) + 1;
        int intentos = 0;
        int Us = 0;
        // formula numero aleatorio (max - min)+min
        System.out.println(Random);

        System.out.println(" puedes adivinar el numero que estoy pensando? ");

        do {

            Us = sc.nextInt();
            intentos++;

            if (Us > Random) {
                System.out.println("es menor ");
                System.out.println(" ");
                System.out.println("intenta otra vez..");
            } else if (Us == 0) {
                break;
            } else {
                System.out.println("es mayor ");
                System.out.println(" ");
                System.out.println("intenta de nuevo...");
            }
        } while (Random != Us);

        if (Us == Random) {
            System.out.println("Ganaste en  " + intentos + " intentos ");
        } else {
            System.out.println("intenta de nuevo, tuviste  " + intentos + " intentos ");
        }

        sc.close();
    }
}


import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner Us = new Scanner(System.in);
        //VARIABLES
        String color;
        //ENTRADA
        System.out.println("Ingrese el color del semaforo: ");
        color = Us.nextLine();
        //PROCESO Y SALIDA
        if (color.equalsIgnoreCase("rojo")) {
            System.out.println("El semaforo esta en rojo, debes detenerte.");
        } else if (color.equalsIgnoreCase("amarillo")) {
            System.out.println("El semaforo esta en amarillo, debes reducir la velocidad.");
        } else if (color.equalsIgnoreCase("verde")) {
            System.out.println("El semaforo esta en verde, puedes avanzar.");
        } else {
            System.out.println("Color de semaforo no valido.");
        
        //FIn
        Us.close();
        }

    }
}


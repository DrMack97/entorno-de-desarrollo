import java.util.Scanner;

public class LectorNumerico {
    public static void main(String[] args) {
        System.out.println("Lector Numerico");
    //entrada
        System.out.println("Por favo, Ingrese un numero:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
    //proceso y salida (practicar if, else if, else)
        if (numero == 0) {
            System.out.println("El numero es CERO");
        } else if (numero > 0) {
            System.out.println("El numero es POSITIVO");
        } else {
            System.out.println("El numero es NEGATIVO");
        scanner.close();
    //fin
        }
    }

}

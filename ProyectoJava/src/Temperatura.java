import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //Variables
        double Fahrenheit;
    //ENTRADA
        System.out.println("Introduce la temperatura en grados Fahrenheit: ");
        Fahrenheit = scanner.nextDouble();
    //PROCESO
        double celcius = (Fahrenheit - 32) * 5 / 9;
    //SALIDA
        System.out.println("La temperatura en grados Celcius es: " + celcius);
        scanner.close();
    }

}

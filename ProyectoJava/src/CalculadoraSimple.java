import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    //Variables
        double numero1;
        double numero2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
    //ENTRADA
        System.out.println("primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("segundo numero: ");
        numero2 = scanner.nextInt();
    //PROCESO
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
    //Salida
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.format("la division es: %.2f" + division);
        scanner.close();
    
    }

}

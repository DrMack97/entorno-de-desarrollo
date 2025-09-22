import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double radio = scanner.nextDouble();
        //ENTRADA
        System.out.println("Introduce el radio de la circunferencia: ");
        
        double radio = scanner.nextDouble();
        
        double areCircle = Math.PI * radio * radio;


        //System.out.println("El area de la circunferencia es: " + area);
        System.out.format("El area de la circunferencia es: %.2f", radio, areCircle);


    }
}

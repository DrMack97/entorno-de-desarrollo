import java.util.Scanner;

public class LongitudRadio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
            double radio;
            double Diametro;
            double volumen;
            double longitud;
        //ENTRADA
            System.out.println("Introduce el radio: ");
            radio = scanner.nextDouble();
        //PROCESO
            Diametro = 2 * radio;
            
            volumen = (4/3) * Math.PI * Math.pow(radio, 3); 

            longitud = 2 * Math.PI * radio;
        //SALIDA
            System.out.println("El diametro es: " + Diametro);
            System.out.println("El volumen es: " + volumen);
            System.out.println("La longitud es: " + longitud);
            scanner.close();
        //HACER DE NUEVO CAMBIAR FORMATO A %.2f
    }

}

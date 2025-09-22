import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
            int lado;
        //ENTRADA
            System.out.println("Introduce el lado del cuadrado: ");
            lado = scanner.nextInt();
        //PROCESO
            int area = lado * lado;
        //SALIDA
            System.out.println("El area del cuadrado es: " + area);
            scanner.close();
        
    }

}

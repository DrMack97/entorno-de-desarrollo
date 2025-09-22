import java.util.Scanner;

public class Facturador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
            int precio;
            int descuento;
        //ENTRADA
            System.out.println("Introduce el precio del producto: ");
            precio = scanner.nextInt();
            System.out.println("Introduce el descuento: " + "%");
            descuento = scanner.nextInt();
        //PROCESO
            int Total = precio - (precio * descuento / 100);
        //SALIDA
            System.out.println("El precio final es: " + Total);
            scanner.close();
    }

}

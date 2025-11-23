import java.util.Scanner;

public class descuento {

    static double totalDescuento(double x, double y) {

        return ((x - y) / x) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("////////////////////Calculadora de descuentos////////////////////////");
        System.out.println();
        System.out.println("indica precio ");
        double x = sc.nextDouble();

        System.out.println("indica precio con descuento");
        double y = sc.nextDouble();

        System.out.println("//////////FACTURA//////////");
        System.out.println();
        System.out.printf("Precio inicial %.0f%n", x);
        System.out.printf("Precio con descuento %.0f%n", y);
        System.out.printf("porcentaje de descuento %.2f%%%n", totalDescuento(x, y));
        double ahorro = x - y;
        System.out.printf("ahorro de: %.0f%n", ahorro);


        // Repasar format  ANOTAR EN EL NOTEBOOK
        sc.close();
    }
}

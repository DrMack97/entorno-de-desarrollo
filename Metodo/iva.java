import java.util.Scanner;

public class iva {
    static float precioAmbiva(float precio){
        float precioAmbiva = precio * 0.21f;

        return  precioAmbiva;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioIva = 0;

        System.out.println("/////////////////calculador de iva/////////////////////");
        do {

        System.out.println("introduce monto de producto ");
            precioIva = sc.nextInt();
            precioIva += precioAmbiva(precioIva);
            System.out.println();
            System.out.println("precio total: "+precioIva+" IVA del 21% =" + precioAmbiva(precioIva));
            
        } while (precioIva != 0);
        
        sc.close();
        // mejorar 
    }
}

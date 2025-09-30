import java.util.Scanner;

public class ejercicioexam2 {
    //una empresa se dedica a la venta de festival de musica 

    // si se compra una entrada no aplica descuento 
    // si se compra 2 entradas aplica un 10% de descuento a la segunda entrada
    // si se compra 3 entradas aplica un 15% de descuento a la tercera entrada

    //el programa debe mostrar cuantas entradas se han comprado y el precio total con un 21% de IVA incluido
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //entradas/variables
        System.out.println("///////////////////////////////////////////Festival//////////////////////////////////////////////");
        final double PrecioBase = 25;
        final double descuento = 0;
        final double descuento1 = 0.10;
        final double descuento2 = 0.15;
        Double PrecioT;

        System.out.println("¿Cuantas entradas desea comprar? ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 1) {
                System.err.print("precio de la entrada: " + PrecioBase);
                
                
                }else if (numero >=2 && numero <= 3 ) {
                    PrecioT = PrecioBase * descuento1;
                    System.out.print("precio de la entrada: " + PrecioT);
                
                }else if (numero >=3 && numero <= 4) {
                    PrecioT = PrecioBase * descuento2;
                    System.out.println("precio de la entrada: " + PrecioT);
            scanner.close();

                
                
            }



    }
}

import java.util.Scanner;

public class CarritoDeBucles {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int us;
        final int aceiteG = 3 , aceiteOliva = 10 , aceiteOlivaplus = 15;
        int aceiteGcantidad = 0 , aceiteOlivacantidad = 0 , aceitepluscantidad = 0;
        int carrito = 0;
        System.out.println("/////////////Bienvenido////////// ");
        System.out.println(" ");
        System.out.println(" Que desea comprar ?");
        do {
            System.out.println(" 1) Aceite girasol 3 eu \n 2) Aceite de Oliva 10 eu \n 3) aceite oliva extra viren 15 eu \n 0) Salir.");
            us = sc.nextInt();

            if (us == 1) {
                aceiteGcantidad++;
                carrito += aceiteG;                
            } else if (us == 2) {
                aceiteOlivacantidad++;
                carrito += aceiteOliva;
            } else if (us == 3){
                aceitepluscantidad++;
                carrito += aceiteOlivaplus;
            }
            
        } while (us !=0);

        System.out.println("/////////////FACTURA///////////////");
        System.out.println(" ");
        System.out.println(" ACEITE GIRASOL " + aceiteGcantidad + "\n Aceite oliva " + aceiteOlivacantidad + "\n aceite de oliva extra virgen "+ aceitepluscantidad);
        System.out.println("TOTAL: " + carrito +" eu");

    sc.close();
    }
}

import java.util.Scanner;

public class ejercicioPruebaDescuentos {
    //Calcula descuentos basados en categoría de cliente y monto de compra.
    //cateoria : (nuevo5%/reular15%)
    public static void main(String[] args) {
    Scanner us = new Scanner(System.in);

        //variables 
        System.out.println("///////////////////////////// CALCULADOR DESCUENTOS ///////////////////////////////////////");
        //entradas 
        System.out.println("INGRESE MONTO: ");
        double monto = us.nextDouble();
        double descuento ;
        System.out.println("INGRESE CATEGORIA:  VIP / REGULAR / NUEVO ");
        String categoría = us.next().toLowerCase();
        //proceso
        if (categoría.equalsIgnoreCase("VIP")) {
            if (monto > 800) {
                descuento = 0.25;
            } else if (monto > 600) {
                descuento = 0.20;
                
            } else{
                descuento = 0.15;
            }
        }else if (categoría.equalsIgnoreCase("Regular")) {
            if (monto > 500) {
                descuento = 0.15;
            } else if (monto > 400) {
                descuento = 0.10;
            }else {
                descuento = 0.05;
            }
        }else if (categoría.equalsIgnoreCase("nuevo")) {
            if (monto > 300) {
                descuento = 0.10;
            } else{
                descuento = 0.05;
            }

        }else {
            System.out.println("categoria invalida");
            return;
        }
        double precioT = monto*(1-descuento);
        System.out.println("descuento = " + (descuento*100) +"%" );
        System.out.println("Precio total = " + precioT);
        us.close();
    } 
    
}

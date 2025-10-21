import java.util.Scanner;

public class ejercicioexam2 {
    //una empresa se dedica a la venta de festival de musica 

    // si se compra una entrada no aplica descuento 
    // si se compra 2 entradas aplica un 10% de descuento a la segunda entrada
    // si se compra 3 entradas aplica un 15% de descuento a la tercera entrada

    //el programa debe mostrar cuantas entradas se han comprado y el precio total con un 21% de IVA incluido
    public static void main(String[] args) {
        Scanner Us = new Scanner(System.in);
        //entradas/variables
        System.out.println("///////////////////////////////////////////Festival//////////////////////////////////////////////");
    //VARIABLES
    final double PrecioBase = 35;
    final double descuento1 = 0.10;
    final double descuento2 = 0.15;
    final double IVA = 0.21;
    double PrecioTotal;
    System.out.println("Cuantas entradas desea comprar?");
        double cantidad = Us.nextDouble();

        if (cantidad == 1) {
            System.out.println("TICKET");
            PrecioTotal = (cantidad*PrecioBase)+(IVA*PrecioBase) ;
            System.out.print("Cantidad de entradas "+ cantidad + " PRECIO TOTAL: $"+ PrecioTotal);
                System.out.println("\n//////////////////////////GRACIAS POR SU COMPRA/////////////////");


        } else if (cantidad == 2) {
            System.out.println("|||||||||||||||||||||||||||TICKET|||||||||||||||||||||||||||||||");
            double entrada1 = PrecioBase;
            double entrada2 = PrecioBase*(1 - descuento1);
            System.out.printf("Cantidad de en entradas " + cantidad + " \nprecio entrada 1: " + entrada1 + " \nprecio entrada 2: " + entrada2);
            PrecioTotal = (entrada1+entrada2)+(IVA*PrecioBase);
            System.out.print("\nPRECIO TOTAL + IVA $ "+PrecioTotal);
                System.out.println("\n//////////////////////////GRACIAS POR SU COMPRA/////////////////");


        } else if (cantidad == 3){
            System.out.println("|||||||||||||||||||||||||||TICKET|||||||||||||||||||||||||||||||");
            double entrada1 = PrecioBase*(1-descuento2);
            System.out.printf("Cantidad de en entradas "+cantidad+"\n precio entrada 1: "+entrada1+"\n precio entrada 2: "+entrada1+"\n precio entrada 3: "+ entrada1);
            PrecioTotal =  (entrada1*3) + (entrada1*IVA)*3;
            System.out.print("\nPRECIO TOTAL + IVA $ "+PrecioTotal);
                System.out.println("\n//////////////////////////GRACIAS POR SU COMPRA/////////////////");
        }else {
                        System.out.println("que coño pasa");
        
        Us.close();
        }
    }
}


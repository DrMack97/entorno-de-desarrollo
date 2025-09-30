import java.util.Scanner;

public class MaquinaCambiaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //ENTRADAS/VARIABLES
    Double CambioFavor;
    Double CambioRestante;

    System.out.println("///////////////////////////////////////////////Maquina Cambiarea/////////////////////////////////////////////////////////");
    System.out.print("Fije monto: ");
    double dinero1 = scanner.nextDouble();
    System.out.print("Ingrese la cantidad de dinero que desea cambiar: ");
    double dinero2 = scanner.nextDouble();

            if (dinero2 > dinero1) {
                    CambioFavor = dinero2-dinero1;
                    System.out.print("Tienes un cambio a favor de: " + CambioFavor);
                
                    }else if (dinero2 < dinero1) {
                        
                        CambioRestante = dinero1-dinero2;
                        System.out.print("FALTAN: " + CambioRestante);
                    
                    }
                    else{
                        System.out.println("//////////////////////////////////MONTO INCORRECTO///////////////////////////////////////////////////////////////");
            }    
            scanner.close();
        }

    }


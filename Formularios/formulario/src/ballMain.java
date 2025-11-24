import java.util.Scanner;

import BallAdvance.BuilderBall;

public class ballMain {
    // metodo pedir tiradas 
    private static int pedirMaxTiradas(Scanner sc){
        int tiradas;
        while (true) {
            System.out.println("cuantas tiradas quieres? (min: 5 - max: 10): ");
            tiradas = sc.nextInt();
            if (tiradas >= 5 && tiradas <= 10) {
                break;
            }else {
                System.out.println("error");
                sc.nextLine(); // limpia el input
            }
        }
        return tiradas;
    }
    public static void main(String[] args) {
        BuilderBall bola = new BuilderBall();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido!");
        System.out.println();
        System.out.println(" PROBABILIDADES:");
        System.out.println("   VERDE (0-4): Avanzas todos los pasos");
        System.out.println("   AMARILLO (5-7): Avanzas la mitad de pasos");
        System.out.println("   ROJO (8-9): No avanzas");
        //System.out.println("\nPresiona ENTER para comenzar...");

        //pedir maximo de tiradas 
        int maxTiradas = pedirMaxTiradas(sc);

        System.out.println("llega lo mas rapido posible en "+ maxTiradas + "tiradas");
        System.out.println("Comencemos");
        
        sc.nextLine();
        
        //juego principal 
        for (int tirada = 1; tirada < maxTiradas; tirada++) {
            
            
            System.out.println("tirada "+ tirada +" / "+maxTiradas);
            System.out.println("////////////////////////////////");

            //mostrar avance actual 
            bola.printAvance();
            //vializacion grafica de la bola
            bola.printPoscionball();
            //pedir pasos 
            int pasosElegidos = bola.pedirPasos();

            BuilderBall.limpiarConsola();                   //es recomendable poner el limpiador despues del scanner para evitar limpiar antes de tiempo
                                                            // 
            //calcular probabilidad                                                 
            String semaforo = bola.calcularProbabilidad(pasosElegidos);

            // recalcular los pasos 
            int pasosFinales = bola.recalculaPasos(pasosElegidos, semaforo);

            // actualizar avance 
            bola.actualizarAvance(pasosFinales);
            System.out.println("\n PRESIONE ENTER");
            sc.nextLine();
    }


    BuilderBall.limpiarConsola();
    bola.printAvance();
    bola.printPoscionball();
    System.out.println("juego terminado!");
    //resultados 
    int maxAlcazado = bola.getMaxAvance();

    if(maxAlcazado >= 15){
        System.out.println("Muy bien");
    }else if(maxAlcazado >= 10){
        System.out.println("bien bien");
    }else if(maxAlcazado >= 5){
        System.out.println("bien");
    }else {
        System.out.println("better next time");
    }

    bola.cerrarScanner();
    sc.close();
    }
}
/**=========
 *     O
 * =========
 */
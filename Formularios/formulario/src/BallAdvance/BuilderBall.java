package BallAdvance;

import java.util.Random;
import java.util.Scanner;

public class BuilderBall {
    private int avanceActual;
    private int maxAvance;
    private Random rnd;
    private Scanner sc;

    public BuilderBall() {
        this.avanceActual = 0;
        this.maxAvance = 0;
        this.rnd = new Random();
        this.sc = new Scanner(System.in);
    }

    // metodo que muestra avance actual y el maximo
    public void printAvance() {
        System.out.println("Avance actual: " + avanceActual);
        System.out.println("Maximo avance: " + maxAvance);
        System.out.println();
    }

    public void printPoscionball(){
        int longitudPista = 20;                      //lonitud fija
        int posicion= avanceActual % longitudPista; // para que no se salga
        
        for (int i = 0; i < longitudPista; i++) {   //linea superior 
            System.out.print("=");
        }
        //bola
        System.out.println();
        for (int i = 0; i < longitudPista; i++) {
            if (i == posicion){
                System.out.print("O");
            }else{
                System.out.print(" ");
            }
        }
        //linea inferior 
        for (int i = 0; i < longitudPista; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println();
    }

    // metodo que pide los pasos y los valida
    public int pedirPasos() {
        int pasos;

        while (true) {
            System.out.println("Cuantos pasos quieres avanzar? (1-3) ");
            // Verificar si el siguiente token es un numero

            pasos = sc.nextInt();
            // sc.nextLine(); //para limpiar el buffer

            if (pasos >= 1 && pasos <= 3) {
                break;
            } else {
                System.out.println("Debe estar entre 1-3❌");
                sc.nextLine();
            }
        }
        return pasos;
    }

    // Semaforo de probabilidad
    public String calcularProbabilidad(int pasos) {
        int numeroRandom = rnd.nextInt(10);

        //System.out.println("NUMERO ALEATORIO " + numeroRandom);

        if (numeroRandom >= 0 && numeroRandom <= 4) {
            System.out.println("VERDE "+ numeroRandom);
            return "VERDE";
        } else if (numeroRandom >= 5 && numeroRandom <= 7) {
            System.out.println("AMARILLO "+ numeroRandom);
            return "AMARILLO";
        } else {
            System.out.println("ROJO "+ numeroRandom);
            return "ROJO";
        }
    }

    // Metodo que recalcula los pasos segun el semaforo
    public int recalculaPasos(int pasosElegidos, String semaforo) {
        int pasosFinales;

        switch (semaforo) {
            case "VERDE":
                pasosFinales = pasosElegidos;
                System.out.println("AVANZAS  " + pasosFinales + " pasos");
                break;
            case "AMARILLO":
                pasosFinales = pasosElegidos / 2;
                if (pasosFinales == 0) pasosFinales = 1;
                System.out.println("Avanzas la mitad " + pasosFinales + " pasos");
                break;
            case "ROJO":
                pasosFinales = 0;
                System.out.println("STOP");
                break;
            default:
                pasosFinales = 0;
                break;
        }
        return pasosFinales;
    }

    //metodo que actualiza el avance 
    public void actualizarAvance(int nuevosPasos){
        avanceActual += nuevosPasos;
        //actualizar avance maximo 
        if (avanceActual > maxAvance){
            maxAvance = avanceActual;
        }
    }
    public void reiniciarAvanceActual(){
        avanceActual = 0;
    }
    //getters
    public int getAvanceActual(){
        return avanceActual;
    }
    public int getMaxAvance(){
        return maxAvance;
    }
    //metodo limpiar consola 
    public static void limpiarConsola(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public void cerrarScanner(){
        sc.close();
    }
}

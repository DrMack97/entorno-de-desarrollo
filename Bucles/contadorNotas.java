import java.util.Scanner;

public class contadorNotas {

    public static void main(String[] args) {
        // lector de numeros
        Scanner sc = new Scanner(System.in);
        // iniciacion de interruptor booleano
        boolean N_positivo = false;
        // variabes
        int nota = 0;
        int NotaPositivo = 0;
        int Nota10 = 0;
        System.out.println("introduzca  notas");
        System.out.println(" ");
        // bucle
        for (int i = 0; i < 5; i++) {
            System.out.println("numero " + (i + 1) + " : "); // SECUENCIA
            nota = sc.nextInt();
            // lector de numeros dentro del bucle para leer varios datos
            if (nota == 10 ) {
                Nota10++;
                N_positivo = true;
            } else if(nota >= 5){
                NotaPositivo++;
                N_positivo = true;
            
            } else if (nota == -1) {
                break;
            }
            // salida
        }
        if (N_positivo) {
            System.out.println("cantidad de 10: " + Nota10 + " aprobados: " + NotaPositivo);
        } else {
            System.out.println("aprobados totales " + NotaPositivo);
        }
        sc.close();
    }
}

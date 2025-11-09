import java.util.Scanner;

public class LectorNumeros3 {
    public static void main(String[] args) {
                                                //lector de numeros
        Scanner sc = new Scanner(System.in);
                                                //iniciacion de interruptor booleano
        boolean N_negativo = false;
        //variabes 
        int num = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        System.out.println("introduzca 100 numeros");
        System.out.println(" ");
        //bucle
        for (int i = 0; i < 5; i++) {
            System.out.println("numero " + (i + 1) + " : ");
            num = sc.nextInt();
                                                // lector de numeros dentro de bucle para leer varios datos
            if (num < 0) {
                contadorNegativo++;
                N_negativo = true;

            } else if (num > 0) {
                contadorPositivo++;

            } else if (num == 0) {
                break;
            }
        //salida
        }
        if (N_negativo) {
            System.out.println("hay " + contadorNegativo + " numeros negativos "+"asi como hay "+ contadorPositivo+ " numeros positivos ");
        } else {
            System.out.println("hay " + contadorPositivo + " numeros positivos ");
        }
        sc.close();
    }
}

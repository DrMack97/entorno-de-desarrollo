import java.util.Scanner;

public class SumaParImpar {
    // ⦁ Programa que entra dos números naturales
    // M, N y suma independientemente los pares y los impares de los números
    // comprendidos entre M y N,
    // y después muestra por pantalla las dos sumas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // acumuladores
        int par1 = 0, impar1 = 0;
        int par2 = 0, impar2 = 0;
        // lector
        System.out.println("ingresa dos numeros ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(" ");
        //bucle1
        for (int i = 0; i < num1; i++) {
            //suma par e impar
            if (i % 2 == 0) {
                par1 = i + par1;
            } else if (i % 2 == 1) {
                impar1 = i + impar1;
            }
        }
        //bucle2
        for (int i = 0; i < num2; i++) {
            // tambien funciona
            if (i % 2 == 0) {
                par2 = i + par2;
            } else {
                impar2 = i + impar2;
            }
        }
        // salida
        System.out.println(num1+" suma de pares "+par1+" suma de impares "+impar1);
        System.out.println(" ");
        System.out.println(num2+" suma de pares "+par2+" suma de impares "+impar2);
        sc.close();

    }
}

import java.util.Scanner;

public class ejeN2 {
    // ⦁ Programa que entra un número natural N y muestra los números pares
    // comprendidos entre 1 y N.
    // Para ello utilice un contador y suma de 2 en 2.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dame un numero y contare de 2 en 2 ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
            System.out.println(i);
        }

        System.out.println("hasta el " + n);
        sc.close();
    }
}

import java.util.Scanner;

public class ejeN3 {
    // ⦁ Programa que entra un número natural N y muestra los números pares
    // comprendidos entre 1 y N.
    // Para ello utilice un contador sumando de 1 en 1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("hasta el " + n);
        sc.nextInt();
    }
}

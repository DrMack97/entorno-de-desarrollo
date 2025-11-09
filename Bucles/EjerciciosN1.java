import java.util.Scanner;

public class EjerciciosN1 {
    //⦁ Programa que lee un número natural N y muestra por pantalla los N primeros números naturales (1, 2, 3,…., N).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("indica un numero y contare hasta alcanzarlo: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i<= n) {
                System.out.println(i);
            }
        }
        System.out.println("hasta el "+ n);
        sc.close();
    }
}

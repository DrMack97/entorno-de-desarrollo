import java.util.Scanner;

public class SumatorioProductorio {
    static int sumatorio(int x, int y) {
        int suma = 0;
        int inicio = Math.min(x, y); // ubica el valor min entre x - y
        int fin = Math.max(x, y);

        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }

        return suma;
    }

    static int productorio(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        int producto = 1;
        int inicio = Math.min(x, y); 
        int fin = Math.max(x, y);

        for (int i = inicio; i <= fin; i++) {
            producto *= i;

        }
        return producto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dos numeros y te entregare su sumatoria y su productorio");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("el sumatorio entre " + x + " y " + y + " es " + sumatorio(x, y));
        System.out.println();
        System.out.println("el productorio entre " + x + " y " + y + " es " + productorio(x, y));

        sc.close();

        // practicar implementado en un nuevo ejercicio 
    }
}

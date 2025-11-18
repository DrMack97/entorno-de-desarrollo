import java.util.Random;
import java.util.Scanner;

public class ClaseRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("activa 5 numeros random");
        System.out.println(" ");
        for (int i = 1; i <= 5; i++) {
            int num = rnd.nextInt(100 + 1) / 2;
            System.out.println(i + " : " + num);
        }
        System.out.println(" presione enter para salir");
        sc.nextLine();

        sc.close();
    }
}

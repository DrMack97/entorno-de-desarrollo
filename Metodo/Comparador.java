import java.util.Scanner;

public class Comparador {

    static int compara(int x, int y) {
        if (x == y) {
            return 0;
        } else if (x < y) {
            return -1;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dos numeros");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(compara(x, y));

        sc.close();
    }
}

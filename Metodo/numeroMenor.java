import java.util.Scanner;

public class numeroMenor {

    static int menor(int x, int y) {
        if (x < y) {
            System.out.println("el menor es " + x);
            return x;
        } else {
            System.out.println("el menor es " + y);
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dame dos numeros, te dire cual es el menor");
        int x = sc.nextInt();
        int y = sc.nextInt();

        menor(x, y);

        sc.close();
    }

}

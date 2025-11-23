import java.util.Scanner;

public class tabla {
    static void t(int x) {
        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            resultado = i * x;
            System.out.println(i + " x " + x + " = " + resultado);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dafdf");
        int num = sc.nextInt();

        t(num);

        sc.close();
    }
}

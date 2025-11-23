import java.util.Scanner;

public class TablasMetodo {
    static int tablas(int x) {
        int num = 0;

        for (int i = 1; i <= 10; i++) {

            num = x * i;
            System.out.println(x + " x " + i + " = " + num);

        }
        return num;                             //inicializar la variable fuera del bucle y ponerle return 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("/////////tablas elige un numero//////////");
        int x = sc.nextInt();

        System.out.println(tablas(x));

        sc.close();
    }
}

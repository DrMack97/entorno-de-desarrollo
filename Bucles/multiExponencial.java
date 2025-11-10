import java.util.Scanner;

public class multiExponencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 1;

        System.out.println(" ");
        System.out.println("dame el numero ");

        int num = sc.nextInt();
        System.out.println("dame el exponente");
        int exp = sc.nextInt();

        // bucle exponente
        for (int i = 0; i < exp; i++) {
            resultado = num * resultado;
            System.out.println("vuelta " + (i + 1) + " : " + resultado);
        }
        System.out.println("el resultado de numero " + num + " exponenete " + exp + " es " + resultado);
        sc.close();
    }
}

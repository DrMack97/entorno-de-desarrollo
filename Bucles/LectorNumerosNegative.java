import java.util.Scanner;

public class LectorNumerosNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables

        boolean N_negativo = false;
        System.out.println("introduzca 100 numeros");

        for (int i = 0; i < 5; i++) {
            System.out.println("numero " +(i +1)+" :");
            int numero = sc.nextInt();

            if (numero < 0) {
                N_negativo = true;
                
            }
        }
        sc.close();

        if (N_negativo) {
            System.out.println("hay numero negativo ");
        } else {
            System.out.println("no hay numero negativo ");
        }
    }

}

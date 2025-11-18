import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int numero;
        do {
            System.out.println("introduce un numero y lo sumamo");
        numero = sc.nextInt();
            total += numero;
            
        } while (numero !=0);

        System.out.println("total: "+total);

        sc.close();
    }

}

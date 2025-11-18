import java.util.Scanner;

public class sumaNumerica {
    // ⦁ Programa que entra un número entero N y calcula y escribe la suma y el
    // producto de los primeros N números naturales.
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int resultado = 0;
        System.out.println("ingrese un numero para iniciar la suma");
    int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(i);
            resultado = i+resultado;
        }
        System.out.println("la suma es "+resultado);

    sc.close();
    }
}

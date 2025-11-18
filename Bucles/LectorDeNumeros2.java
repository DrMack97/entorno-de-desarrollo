import java.util.Scanner;

public class LectorDeNumeros2 { 
    //⦁ Programa que lee 100 números no nulos y después muestra un mensaje indicando cuántos son positivos y cuántos negativos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean N_negativo = false;
        int num = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        System.out.println("introduzca 100 numeros");
        for (int i = 0; i < 5; i++) {
            System.out.println("numero "+(i+1)+" : ");
            num = sc.nextInt();

            if (num < 0) {
                contadorNegativo++;
                N_negativo = true;
                
            }else if (num > 0) {
                contadorPositivo++;
            }
        }
        if (N_negativo) {
            System.out.println("hay "+contadorNegativo+" numeros negativos ");
        } else {
            System.out.println("hay "+ contadorPositivo+ " numeros positivos ");
        }
        sc.close();
    }
}

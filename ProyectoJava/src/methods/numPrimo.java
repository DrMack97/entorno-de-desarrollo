package methods;

import java.util.Scanner;

public class numPrimo {

    static int lectorNumbers(String unMensaje) { // ----> se hace para poder adaptarlo a cualquier ocasion
        // scanner open
        Scanner sc = new Scanner(System.in);
        System.out.println(unMensaje + ": ");
        int x = Integer.parseInt(sc.nextLine()); // lector

        while (x <= 1) {
            System.out.println("Error" + unMensaje + ": ");// validador
            x = Integer.parseInt(sc.nextLine());
        }
        return x;
        
    }
    static void esPrimoOno(int x) {
        
        if (validadorNumPrimo(x)) {
            System.out.println(x+"es primo");
        } else {
            System.out.println(x+" no es primo ");
        }
    }
    static boolean validadorNumPrimo (int num){
            int count = 2;
            int mitad = num /2;
            while (count <= mitad && !esMultiplo(num,mitad)) {
                count++;
            }
            return count > mitad;
    }
    static int obtenerResto (int num1, int num2){
        return num1 - num2 * (num1/num2);
    }
    static boolean esMultiplo (int a ,int b){       //validador booleano de multiplo true = 0 ! false
        return obtenerResto(a, b) == 0;
    }

    public static void main(String[] args) {
        int n = lectorNumbers("lector de numeros primos ingresa un numero"); // lector

        esPrimoOno(n);



    }
}

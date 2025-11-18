import java.util.Scanner;

public class Factorial { /*
                          * ⦁ Programa que lee un número positivo N y calcula y muestra su factorial N!
                          * 0! = 1
                          * 1! = 1
                          * 2! = 2*1
                          * 3! = 3 * 2* 1
                          * N! = N * (N-1) * (N-2) * … * 1
                          */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("////////////Factorial/////////////");
        System.out.println(" ");
        
        // variables
        System.out.println(" dame un numero para indicar su factor ");
        int n = sc.nextInt();                   //si N = 5
        int resultado = 1;
        // bucle
        System.out.println(" "); //separador
        if (n > 0) {
            for (int i = 2; i <= n; i++) {      //el bucle dara 5 vueltas
                resultado = i * resultado;      //(v1) r= 1 * i= 2 //(v2) r=2 * i=3//(v3) r=6 * i=4 //v(5) r=24 * i=5
                // System.out.println(i);
                System.out.println(resultado); // r*i(24*5) = 120
            }
        } else if (n == 1) {
            System.out.println(" es 1");

        } else {
            System.out.println("no es un numero positivo o mayor que 0");
        }
        System.out.println(" ");//separador
        System.out.println("el factor de " + n + " es " + resultado);
    sc.close();
    }
}

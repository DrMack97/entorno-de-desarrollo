import java.util.Scanner;
//⦁ Programa que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €) 
//mostrará los billetes de cada tipo que serán necesarios para alcanzar esta cantidad 
//(utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Es necesario indicar el mínimo de billetes posible. 
//Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € 
//(no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes posible).

public class ContadorBillete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int B500 = 0, B200 = 0, B100 = 0, B50 = 0, B20 = 0, B10 = 0, B5 = 0;

        System.out.println("//////////////contador de billetes//////////////");
        System.out.println(" ");
        System.out.println("ingresa una cantidad (multiplo de 5)");
        cantidad = sc.nextInt();

        // comprobantes de procedencia
        if (cantidad % 5 != 0) {
            System.out.println("no es multiplo e 5");
        } else if (cantidad == 0) {
            System.out.println("no se permite 0");
        }
        int resto = cantidad;
        while (resto != 0) { // bucle que se repite mientras quede dinero
                             // resto contiene el dinero que queda, uso de % a modo de resta
            if (resto >= 500) {
                B500 = resto / 500;
                resto = resto % 500;
                System.out.println(resto);
            } else if (resto >= 200) {
                B200 = resto / 200;
                resto = resto % 200;
            } else if (resto >= 100) {
                B100 = resto / 100;
                resto = resto % 100;
            } else if (resto >= 50) {
                B50 = resto / 50;
                resto = resto % 50;
            } else if (resto >= 20) {
                B20 = resto / 20;
                resto = resto % 20;
            } else if (resto >= 10) {
                B10 = resto / 10;
                resto = resto % 10;
            } else if (resto >= 5) {
                B5 = resto / 5;
                resto = resto % 5;
            }

        }

        if (B500 > 0)
            System.out.println(B500 + " BILLETES DE 500");
        if (B200 > 0)
            System.out.println(B200 + " BILLETES DE 200");
        if (B100 > 0)
            System.out.println(B100 + " BILLETES DE 100");
        if (B50 > 0)
            System.out.println(B50 + " BILLETES DE 50");
        if (B20 > 0)
            System.out.println(B20 + " BILLETES DE 20");
        if (B10 > 0)
            System.out.println(B10 + " BILLETES DE 10");
        if (B5 > 0)
            System.out.println(B5 + " BILLETES DE 5");

        sc.close();
    }

}

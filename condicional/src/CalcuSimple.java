//Programa que lee dos números, calcula y muestra el valor de la suma, la resta, el producto y la división. (Ten en cuenta la división por cero).

import java.util.Scanner;

public class CalcuSimple {
    public static void main(String[] args) {
//variables        
        double n1;
        double n2;
        double suma;
        double resta;
        double multi;
        double divi;
        Scanner scanner = new Scanner(System.in);
//entrada
        System.out.println("Ingrese numero 1:");
        n1 = scanner.nextDouble();
        System.out.println("Ingrese numero 2:");
        n2 = scanner.nextDouble();
//proceso
        suma = n1 + n2;
        resta = n1 - n2;
        multi = n1 * n2;
        if (n2 != 0) {
            divi = n1 / n2;
            System.out.println("La division es: " + divi);
        } else {
            System.out.println("Error: Division por cero no es permitida.");
        }
//salida
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        
        scanner.close();
   
        }
    }


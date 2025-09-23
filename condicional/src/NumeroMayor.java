import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //variables
        int num1, num2, num3;
    //entrada
        System.out.println("Ingrese el primer numero:");
            num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
            num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero:");
            num3 = scanner.nextInt();
    //proceso
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        scanner.close();

        }



        }
    } 


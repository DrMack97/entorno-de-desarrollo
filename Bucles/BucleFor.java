import java.util.Scanner;

public class BucleFor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variables

        double promedio = 0;
        System.out.println("cuantos numeros desea introducir ");
        int CantidadNumeros = entrada.nextInt();

        //Bucle 
        for (int i = 0; i < CantidadNumeros; i++) {
            System.out.println("dime 5 numeros "+(i+1)+" pero ya");
            int num = entrada.nextInt();
            promedio += num;
        }
        //salida

        System.out.println("el promedio es: " + promedio/CantidadNumeros);


        entrada.close();
    }

}

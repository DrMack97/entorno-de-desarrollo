import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int num = 0;
        int us = 0;

        do {
            
            System.out.println("dame un numero ");
            us = sc.nextInt();
            cantidad++;
            num += us;
            System.out.println(" ");
            System.out.println(num);
            System.out.println(" ");
            System.out.println(cantidad);
            
        } while (us != 0);
        System.out.println(num +"/"+ cantidad);
        int Promedio = num / (cantidad -1);
        System.out.println("el promedio de los numeros sumados es " + Promedio);

        sc.close();
    }
}

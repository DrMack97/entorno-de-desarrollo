import java.util.Scanner;

public class ElsProductDeDuesNum {

    static double producto(double a, double b){
        double r = a*b;
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("de que numeros(2) deseas conocer su producto ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double res = producto(a, b);


        System.out.println("el producto es "+res);

        sc.close();
    }

}

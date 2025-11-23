import java.util.Scanner;

public class ecuacion2doGrado {
    static double calculoDiscriminante(double a, double b, double c) {
        // calculo de la discriminante
        return b * b - 4 * a * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Resolvente ");
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b =");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();

        // verifica que la ecuacion sea de segundo grado
        if (a == 0) {
            System.out.println("no es una ecuacion de segundo grado"); 
        } else {
            double delta = calculoDiscriminante(a, b, c);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta) / (2*a));
            double x2 = (-b - Math.sqrt(delta) / (2*a));
            System.out.printf("solucion 1: x1 = %.2f",x1);
            System.out.printf("\nsolucion 2: x2 = %.2f%n",x2);
        } else if (delta == 0) {
            double x = -b /(2*a);
            System.out.printf("solucion unica: x = %.2f%n", x);
        } else {
            System.out.println("no tiene soluciones reales ");
        }
    }

        // volver hacer espues de ver un video de la aplicacion paso a paso y un video de la 
        //ecuacion de segundo grado como tal 
        sc.close();
    }
}

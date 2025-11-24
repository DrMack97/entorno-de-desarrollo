import java.util.Scanner;

public class trianguloFalse {
    static boolean validacionTriangulo(int x, int y, int z) {
        if (x + y < z) {
            return false;
        } else if (y + z < x) {
            return false;
        } else if (x + z < y) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DESIGUALDAD TRIANGULAR");
        System.out.println();
        System.out.println("Lado a");
        int a = sc.nextInt();
        System.out.println("Lado b");
        int b = sc.nextInt();
        System.out.println("lado c");
        int c = sc.nextInt();

        System.out.println("Lados: a= " + a + " b= " + b + " c= " + c);

        if (validacionTriangulo(a, b, c)) {
            System.out.println("Correcto!");
        }else{
            System.out.println("triangulo incorrecto");
        }
        //System.out.println(validacionTriangulo(a, b, c));

        //mejorar

        sc.close();
    }
}

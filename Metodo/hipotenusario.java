import java.util.Scanner;

public class hipotenusario {
    static double hipotenusa (int a, int b){
        double hipotenusa = Math.pow(a, 2) + Math.pow(b, 2);
        return hipotenusa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("indique 2 lados del triangulo rectangulo ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();

        System.out.println("Lado a: "+a);
        System.out.println("lado b: "+b);
        System.out.printf("HIPOTENUSA: %.0f%n",hipotenusa(a, b)); // formatttt %.0f%n

        sc.close();
    }

}

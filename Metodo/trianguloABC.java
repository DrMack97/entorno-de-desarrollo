import java.util.Scanner;

public class trianguloABC {

    static void triangulo(int n, String m) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(m.charAt(0));
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("///TRIANGULITO///");

        System.out.println("elige caracter");
        String caracter = sc.nextLine();

        System.out.println("indica altura");
        int altura = sc.nextInt();

        System.out.println();

        triangulo(altura, caracter);
        
        sc.close();
    }
}

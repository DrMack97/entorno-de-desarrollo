package Figuras;

import java.util.Scanner;

public class ChristmatsTree {

    static void arbol(int n, String m) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 5; j <= i; j++) {
                //System.out.print("");
                if (i == 0 || i == n - 1 || j == 0 || j == i)
                    System.out.print(m.charAt(0)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Arbol de navidad");

        System.out.println("elige el caracter");
        String caracter = sc.nextLine();

        System.out.println("indica altura");
        int altura = sc.nextInt();

        System.out.println();

        arbol(altura, caracter);

        sc.close();
    }

}

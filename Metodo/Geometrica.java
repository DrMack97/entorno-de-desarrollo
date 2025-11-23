import java.util.Scanner;

public class Geometrica {
    // Menu
    static void menu() {
        System.out.println("que figura quieres ver? elige ");
        System.out.println("-------------------------------");
        System.out.println("1. cuadrado");
        System.out.println("2. cuadrado sin relleno");
        System.out.println("3. triangulo");
        System.out.println("4. triangulo sin relleno");
        System.out.println("-------------------------------");
        System.out.println("5. Salir");
    }

    /**
     * dibuja un cuadrado relleno de asteriscos
     * 
     * @param n en el lado del cuadrado
     * @return
     */
    static void cuadrado(int n) {
        System.out.println();
        for (int i = 0; i < n; i++) { // Filas

            for (int j = 0; j < n; j++) { // Columnas
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * dibuja un cuadrado de asteriscos sin relleno
     * 
     * @param n es el lado del cuadrado
     */
    static void cuadradoSinRelleno(int n) {

        System.out.println();
        for (int i = 0; i < n; i++) { // Filas
            for (int j = 0; j < n; j++) { // Columnas

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * dibuja un triangulo donde n es la altura del triangulo
     * 
     * @param n
     */

    static void triangulo(int n) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");  //printtt
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * dibuja un triangulo formado por asteriscos sin relleno
     * 
     * @param n donde n es su altura
     */
    static void trianguloSinRelleno(int n) {

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dimension = 0;

        do {
            menu();
            opcion = sc.nextInt();

            if (opcion > 0 && opcion < 5) { // hace que si o si opcion deba estar dentro de 0 y 5 para continuar
                System.out.println(" indica el tamaño de la figura ");
                dimension = sc.nextInt();
            } else {
                System.out.println("opcion invalida");
                break;
            }

            switch (opcion) {
                case 1:
                    cuadrado(dimension);
                    break;
                case 2:
                    cuadradoSinRelleno(dimension);
                    break;
                case 3:
                    triangulo(dimension);
                    break;
                case 4:
                    trianguloSinRelleno(dimension);
                    break;
                case 5:
                    break;
            }

        } while (opcion != 5);
        sc.close();
    }
}

import java.util.Scanner;

public class Ejercicio1 {
    // saludo inicial
    static void saludo(String nombre) {
        System.out.println("hola, " + nombre + " que tal estas?? ");
    }

    // perimetroCubo
    static int perimetroCubo(int c) {
        return c * c * c;

    }

    // multiplica dos numeros dados
    static int multi(int a, int b) {
        return a * b;

    }
    // tabla de multiplicar

    static void tablaMulti(int a) {
        System.out.println("\ntabla " + a);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + a + " = " + multi(i, a));
        }
    }

    // comprobacion booleana
    static boolean esPar(int par) {
        return par % 2 == 0 ? true : false;
    }

    // par o impar
    static void mostrarParOImpar(int n) {
        if (esPar(n))
            System.out.println(n + "\n es par");
        else
            System.out.println("\n es impar");
    }

    static void Menu(int opciones) {
        System.out.println("\nMenu principal selecciona una opcion de "+ opciones);
        for (int i = 1; i < opciones; i++)
        {
            System.out.println(i+" - esta es la opcion "+ i);
        }
        System.out.println(opciones+"\n - SALIR");
    }

    public static void main(String[] args) {

        String nombre = "Noland";
        int nomero = 20;
        // multiplica dos numeros dados
        Scanner sc = new Scanner(System.in);
        int d = 0, c = 0;
        System.out.println("introduce numd y numc");
        d = sc.nextInt();
        c = sc.nextInt();

        // saludo inicial
        saludo(nombre);

        // perimetroCubo
        System.out.println("\nel cubo de 5  " + perimetroCubo(nomero));

        // output multiplicacion
        System.out.println("\nresultado " + multi(d, c));

        // tabla de multiplicar
        tablaMulti(nomero);

        // par o impar
        mostrarParOImpar(nomero);

        // MENU OPCIONES
        Menu(nomero);

        sc.close();
    }
}

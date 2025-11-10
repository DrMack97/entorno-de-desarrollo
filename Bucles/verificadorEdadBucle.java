import java.util.Scanner;

public class verificadorEdadBucle {
    // ⦁ Programa que pide un nombre y una edad, verifica la validez de la edad
    // (numérico, entre 1 y 100 ambos incluidos)
    // y, si no es válida, vuelve a preguntarla hasta que lo sea. Por último,
    // mostrará el nombre y la edad.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        boolean validez = false;
        System.out.println("Nombre y edad por favors");
        nombre = sc.nextLine().toLowerCase().trim();
        edad = sc.nextInt();

        while (validez == false) {
            if (edad >= 1 && edad <= 100) {
                validez = true;
                System.out.println(nombre);
            } else {
                System.out.println("puede repetir por favor?");
                System.out.println(nombre);
                edad = sc.nextInt();
            }
        }
        System.out.println("Bienvenido " + nombre + " de " + edad + " años");
        sc.close();
    }
}

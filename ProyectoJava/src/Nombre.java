import java.util.Scanner;

public class Nombre {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Variables
            String nombre;
            String apellido;
        //ENTRADA
            System.out.println("hola cual es tu nombre? ");
            nombre = scanner.nextLine();
            System.out.println("y tu apellido? ");
            apellido = scanner.nextLine();
        //SALIDA
        System.out.println("Buen dia " + nombre + " " + apellido);
        scanner.close();

    }
    

}

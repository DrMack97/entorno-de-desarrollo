import java.util.Scanner;

public class eresMayorDeEdad {

    static boolean mayorEdad(int edad){
        return edad >= 18;
    }
    static void resultado(int edad){
        if (mayorEdad(edad)) {
            System.out.println("mayorsito");
        }else{
            System.out.println("niño rata");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("que edad tienes?");
        int edad = sc.nextInt();

        resultado(edad);

        System.out.println(mayorEdad(edad));

        sc.close();
    }
}

// muestra el dia de la semana

import java.util.Scanner;

public class Semanal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia;
    //entrada
        System.out.println("Ingrese un numero del 1 al 7");
        dia = lector.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Diluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimerques");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println(" numero incorrecto ");
                break;
        }
        lector.close();
    }
}



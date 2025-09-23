// muestra el dia de la semana

import java.util.Scanner;

public class CondicionM {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia;
    //entrada
        System.out.println("Ingrese un numero del 1 al 7");
        dia = lector.nextInt();

        if (dia == 1) {
            System.out.println("lunes");
        } else if (dia == 2) {
            System.out.println("martes");
        } else if (dia == 3) {
            System.out.println("miercoles");
        } else if (dia == 4) {
            System.out.println("jueves");
        } else if (dia == 5) {
            System.out.println("viernes");
        } else if (dia == 6) {
            System.out.println("sabado");
        } else if (dia == 7) {
            System.out.println("domingo");
        } else {
            System.out.println("numero incorrecto");
            
        }
        /*  
        //Switich
        switch (dia) {
            case 1: 
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("numero incorrecto");
                break;
            */

        }

    }
}


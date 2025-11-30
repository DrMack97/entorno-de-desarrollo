import java.util.Scanner;

import console.CalcHelper;
import console.tools.CalcInut;



public class cinemaTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalcInut lec = new CalcInut();
        CalcHelper calc = new CalcHelper();
        
        System.out.println("===CINEMA===");
        System.out.println();

        String mensaje = "QUE OPERACION DESEA?";
        
        String operador = lec.operationInput(mensaje);
        
        System.out.println("haz elegido "+ operador);

        mensaje = "indica numero 1 ";

        double num1 = lec.op1Input(mensaje);
        
        mensaje = "indica numero 2";

        double num2 = lec.op2Input(mensaje);

        System.out.println("operacion: "+ num1 + operador + num2);

        switch (operador) {
            case "+":
                double suma = calc.suma(num1, num2);
                System.out.printf("resultado de la suma es igual a %.0f",suma );
                break;
            case "-":
                double resta = calc.resta(num1, num2);
                System.out.printf("resultado de la suma es igual a %.0f",resta );
                break;
            case "*":
                double multiplicacion = calc.multiplicacion(num1, num2);
                System.out.printf("resultado de la suma es igual a %.0f",multiplicacion );
                break;
            case "/":
                double division = calc.multiplicacion(num1, num2);
                System.out.printf("resultado de la suma es igual a %.0f",division );
                break;
            default:
                System.out.println("invalido");
                break;
        }
        
    sc.close();
    }

}

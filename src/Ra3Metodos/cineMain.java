package Ra3Metodos;

import Ra3Metodos.consola.herramientas.CalcuAyuda;
import Ra3Metodos.consola.herramientas.CalcuInput;

public class cineMain {

    public static void main(String[] args) {

        double resultat= 0.0;
        CalcuAyuda calcu = new CalcuAyuda();
        CalcuInput lector = new CalcuInput();

        System.out.println("=== Introduce operadores ===");

        double a = lector.op1Input();

        double b = lector.op2Input();


        String operador = lector.operationInput();
        
        switch (operador) {
            case "+":
                resultat = calcu.suma(a, b);
                break;
            case "-":
                resultat = calcu.resta(a, b);
                break;
            case "*":
                resultat = calcu.multi(a, b);
                break;
            case "/":
                resultat = calcu.divi(a, b);
                break;
        
            default:
                System.out.println("operador invalido ");
                break;
        }

        System.out.printf("resultat: %.2f", resultat);
        
    }

    
}

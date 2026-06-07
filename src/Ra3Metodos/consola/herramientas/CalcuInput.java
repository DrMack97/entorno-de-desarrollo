package Ra3Metodos.consola.herramientas;

import java.util.Scanner;

public class CalcuInput {

    Scanner sc = new Scanner(System.in);

    public double op1Input(){
        System.out.println("Introdueix operador 1:");
        double op1 = sc.nextDouble();
        return op1;
    }

    public double op2Input(){
        System.out.println("Introdueix operador 2:");
        double op2 = sc.nextDouble();
        sc.nextLine();
        return op2;
    }

    public String operationInput(){
        System.out.println("Digues quina operació vols fer + - * /");
        String operacion = sc.nextLine();

        return operacion;
    }

}

package console.tools;

import java.util.Scanner;

public class CalcInut {

    public double op1Input(String mensaje){
        System.out.println(mensaje);
        System.out.println(": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public double op2Input(String mensaje){
            System.out.println(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public String operationInput(String mensaje){
        System.out.println(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    
    }
    //        private final Scanner sc = new Scanner(System.in);
    
    /*public double op1Input(String mensaje){
        return sc.nextDouble();
    }
    public double op2Input(String mensaje){
        return sc.nextDouble();
    }
    public String operationInput(String mensaje){
        sc.nextLine(); // consume leftover newline if needed
        return sc.nextLine();
    }
     */
}

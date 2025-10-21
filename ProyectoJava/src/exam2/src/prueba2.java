import java.util.Scanner;

public class prueba2 {
    /*Fes un programa que calculi els impostos que has de pagar en funció del teu salari anual. El programa
haurà de calcular el IRPF en funció de la següent taula i mostrar el salari anual brut, el salari anual net i la
quantitat d’impostos a pagar. Si te bonificació per algun dels següents, discapacitat, situació de risc o
maternitat, haura de mostrar que el salari brut es igual al salari net i a IRPF EXEMPT*/

public static void main(String[] args) {
    Scanner us = new Scanner(System.in);

    System.out.println("////////////////////////////CALCULADORA DE SALARIOS////////////////////////////////////");

    //entradas// variables
    double salarioNeto= 0;
    double impuesto = 0;

    System.out.println("NOMBRE ");
        String nombre = us.next().toLowerCase();
        
    System.out.println("INTRODUCIR SALARIO ANUAL");

        double salarioBruto = us.nextDouble();

    System.out.println("TIENE ALGUNA INCAPACIDAD? SI/NO");
        String incapacidad = us.next().toLowerCase();

        //DECLARACION DE TRAMOS
        double tramo1= 0.19, tramo2 = 0.24, tramo3 = 0.30, tramo4 = 0.37, tramo5 = 0.45, tramo6 = 0.47;  

        // PROCEDIMIENTO
        if (incapacidad.equalsIgnoreCase("NO")) {
                
                } if (salarioBruto <= 12450) {
                impuesto = (salarioBruto*tramo1); //(SALARIO*0.19) = CIFRA IMPOSITIVA
                
                } if (salarioBruto <= 20200) {
                impuesto = (salarioBruto*tramo2);

                } if (salarioBruto <= 35200) {
                impuesto = (salarioBruto*tramo3);

                } if (salarioBruto <= 60000) {
                impuesto = (salarioBruto*tramo4);

                } if (salarioBruto <= 300000) {
                impuesto = (salarioBruto*tramo5);
                    
                } if (salarioBruto >= 300000) {
                impuesto = (salarioBruto*tramo6);   //(SALARIO*0.47) = CIFRA IMPOSITIVA

            }else if (incapacidad.equalsIgnoreCase("SI")) {
                salarioNeto = salarioBruto;
                impuesto = 0;                       //EXENTO DE IMPUESTO 
                
            } else {
                System.out.println("UNKNOW");
            }
    salarioNeto = salarioBruto - impuesto;          //CALCULO SUELDO NETO
            //SALIDA
    System.out.println("NOMBRES " + nombre);
    System.out.println("SALARIO ANUAL BRUTO: " + salarioBruto);
    System.out.println("SALARIO ANUAL NETO: " + salarioNeto);
    System.out.println("TIENE ALGUNA INCAPACIDAD: " + incapacidad);
    System.out.println("IMPUESTOS: " + impuesto);
   
    
        
            us.close();
        }
    }
            


        







        
/*Resutat:
Salari Brut: 24000€
Salari Net: 24000€
IRPF: EXEMPT*/





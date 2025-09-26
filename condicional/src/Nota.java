import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        System.out.println("---");
        System.out.println("---");

        System.out.println("=== Nota del estudiante ===");
        Scanner scanner = new Scanner(System.in);
    //variables
        int nota;
          
        

    //entrada
        System.out.println("Ingrese la nota del estudiante (0-10):");
            nota = scanner.nextInt();
    //proceso y salida
            if (nota >= 10 ) {
                System.out.println("Excel-lent");
                } else if (nota >= 9) {
                System.out.println("Excel-lent");
                } else if (nota >= 8) {
                System.out.println("Notion");
                } else if (nota >= 7) {
                System.out.println("Notion");
                } else if (nota >= 6) {
                System.out.println("suficient");
                } else if (nota >= 5) {
                System.out.println("suficient");
                } else if (nota >= 4) {
                System.out.println("insuficiente");
                } else if (nota <= 3) {
                System.out.println("Molt deficiente");
        
                    } else {
                        System.out.println("numero incorreto ");
     
            }
        scanner.close();
                


            
        if (9 <= nota <= 10) {
                
          
        
         //(9 <= nota <= 10); 
            //System.out.println("Excel-lent");
            
        }

        /*0<=x<3 Molt Deficient
        3<=x<5 Insuficient
        5<=x<6 Suficient
        6<=x<7 Bé
        7<=x<9 Notable*/
       

    

    }
    

package Ra2Bucles;

import java.util.Random;
import java.util.Scanner;

public class LanzaDados {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random dados = new Random();
        int cantidad = 0, op= 0, suma = 0;
        int dado = 0;
        boolean exitGame = false;

        do {
            System.out.println("¿Lanzar dados? (1=sí, 0=no)");
            op = sc.nextInt();

            if (op >= 1) {
                System.out.println("== New dados Game ==");
                
                do {
                    System.out.println("Cuantos dados quieres lanzar? (2-5)");

                    cantidad = sc.nextInt(); 
                    
                } while (cantidad < 2 || cantidad > 5);// WHILE que cantidad sea menor que 2 o mayor que 5
                

                for (int i = 1; i <= cantidad; i++) {
                    dado = dados.nextInt(1,6+1);
                    suma += tirarDado(dado);
                }

                System.out.println("haz sacado un "+suma+" en total!!!");
            }else{
                exitGame = true;
                System.out.println("adio ");
            }
            
        } while (!exitGame);
        
    }

    static int tirarDado(int dado){

        switch (dado) {
            case 1:
                System.out.println("+-----+");
                System.out.println("|  •  |");
                System.out.println("+-----+");
                System.out.println(dado);
                                        break;
            case 2:
                System.out.println("+------+");
                System.out.println("| •    |");
                System.out.println("|   •  |");
                System.out.println("+------+");
                System.out.println(dado);
                break;
            case 3:
                System.out.println("+------+");
                System.out.println("| •    |");
                System.out.println("|   •  |");
                System.out.println("|     •|");
                System.out.println("+------+");
                System.out.println(dado);
                break;
            case 4:
                System.out.println("+------+");
                System.out.println("| •  • |");
                System.out.println("| •  • |");
                System.out.println("+------+");
                System.out.println(dado);
                break;
            case 5:
                System.out.println("+-------+");
                System.out.println("| •   • |");
                System.out.println("|   •   |");
                System.out.println("| •   • |");
                System.out.println("+-------+");
                System.out.println(dado);
                break;
            case 6:
                System.out.println("+-------+");
                System.out.println("| •   • |");
                System.out.println("| •   • |");
                System.out.println("| •   • |");
                System.out.println("+-------+");
                System.out.println(dado);
                break;
        
            default:
                System.out.println("Inusual error");
                break;
        }

        return dado;
    }



}

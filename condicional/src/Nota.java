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
    switch (nota) {
        case 10:
        case 9: System.out.println("Excel-ent");
            break;
        case 8:
        case 7: System.out.println("Owensome");
            break;
        case 6:
        case 5: System.out.println("La hiciste");
            break;
        case 4:
        case 3:
        case 2:
        case 1: System.out.println("muelto");
            break;
        case 0: System.out.println("muelto");
            break;
    
        default:
        System.out.println(" valor incorrecto ");
            break;

        }
        scanner.close();
        }
    }
    

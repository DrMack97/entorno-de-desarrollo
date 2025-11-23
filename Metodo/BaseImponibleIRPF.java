import java.util.Scanner;

public class BaseImponibleIRPF {

    // CALCULAR BASE IMPONIBLE
    // CASO DISCAPACITADO
    // DESCUENTO MAYOR DE EDAD
    /**
     * calcula los tramos de la base imponible
     * 
     * @param baseImponible
     * @return
     */
    static double calcularCuota(double baseImponible) {
        double porcentaje;
        if (baseImponible <= 10000) {
            porcentaje = 5;

        } else if (baseImponible <= 15000) {
            porcentaje = 8;
        } else if (baseImponible <= 30000) {
            porcentaje = 12;
        } else if (baseImponible <= 60000) {
            porcentaje = 20;
        } else {
            porcentaje = 25;
        }

        return baseImponible * (porcentaje / 100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==Calculador IRPF==");
        System.out.println();

        //pedir datos 
        System.out.println("ingresa tu base imponible");
        double baseImponible = sc.nextDouble();

        System.out.println("eres discapacitado? (s/n)");
        char discapacitado = sc.next().toLowerCase().charAt(0);

        //verificar caso de discapacidad 
        if (discapacitado == 's') {
            System.out.println("ESTAS EXENTO");
            System.out.println("la cuota es = 0");
            //ademas detiene el proceso 
        }else {
            System.out.println("ingresa tu edad");
            int edad = sc.nextInt();
        
        // calcular cuota 
        double cuota = calcularCuota(baseImponible);

        if (edad >= 65) {
            System.out.println("al ser parte de la tercera edad tiene un descuento de 250eu");
            cuota = cuota -250;
            // condicion mayor de 65 
        }
        if (cuota < 0) {
            cuota = 0;
            
        }

        System.out.println("===Resultados===");
        System.out.printf("base imponible : %.0f%n",baseImponible);
        System.out.printf("total cuota a pagar: %.0f%n", cuota);
    }

    sc.close();
    }
}

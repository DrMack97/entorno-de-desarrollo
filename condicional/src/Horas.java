import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables entradas
        int h,m,s,ts;
        System.out.print("Ingresa hora: ");
        h = scanner.nextInt();
        System.out.print("Ingresa minutos: ");
        m = scanner.nextInt();
        System.out.print("Ingresa segundos: ");
        s = scanner.nextInt();
        System.out.print("ingrese segundos extra: ");
        ts = scanner.nextInt(); 
        // proceso 
        int sumaS = s + ts;
        int minS = sumaS / 60;
        m += minS;
        s = sumaS % 60;
        // salida 
        System.out.printf("horas: "+h+":"+m+":"+s);
        
    }

}

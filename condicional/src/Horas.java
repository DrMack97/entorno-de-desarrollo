import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //variables entradas
        /*int h,m,s,ts;
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
        System.out.printf("horas: "+h+":"+m+":"+s);*/

        int h,m,s,ts; 
        h = 12;
        m = 35;
        s = 50;
        ts = 10;
        // entrada

        int sumaS = s + ts;
        if (sumaS >= 60) {
            int minS = sumaS / 60;
            s = sumaS % 60;
            minS += m;
            if(minS >= 60) {
                //sumas horas
                int hrS = minS / 60;
                m = minS % 60; 
                h += hrS;
                }else{
                    s = sumaS;
            
            }
                System.out.format("hora: %2h:%2m:%2s" + h + m + s);
        }
        
    }

}

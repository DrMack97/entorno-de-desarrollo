import java.util.Scanner;

public class IRPF {
    static boolean edad(int e){
        return e >= 65;

    }
    /*static boolean discapacitado(String sn){
        Scanner sc = new Scanner(System.in);
        System.out.println("es usted discapacitado? si/no");
        x= sc.nextLine().toLowerCase().trim();
        if (x = ) {
            return true;
        }else {
            return false;

        }*/
    //}
    static double calculoCuota( double x){
        if (x >= 0 && x <= 10000) 
            return x*0.05;
        if (x >= 10001 && x <= 15000) 
            return x*0.08;
        if (x >= 15001 && x <= 30000) 
            return x*0.12;
        if ( x >= 30001 && x <= 60000)
            return x*0.20;

        return x*0.25;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double descuento = 250;

        System.out.println("////////calculo de su cuota de IRPF//////////");
        System.out.println("nombre: ");
        String nombre = sc.nextLine().toLowerCase().trim();

        System.out.println("edad: ");
        int edad = sc.nextInt();

        System.out.println("introduzca cuota por favor");
        double cuota = sc.nextDouble();

        if (edad(edad)) {
            System.out.println("tienes un descuento de "+descuento+" eu");
        }else{
            System.out.println("descuento null");
        }

        //salidas 
        

        System.out.println("don "+nombre+" su cuota es de "+(calculoCuota(cuota)-descuento));

    sc.close();
    }

}

import java.util.Scanner;

public class conversorMillasKm {

    static double millasAKm(int millas){
        double distancia = 1.60934;
        double km = millas * distancia;

        return km;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERSOR MILLAS A KM");
        int x = sc.nextInt();
        
        millasAKm(x);

        System.out.println("Distancia en km "+millasAKm(x));

        sc.close();
    }

}

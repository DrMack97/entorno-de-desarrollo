import java.util.Scanner;

public class Millas.java {
    public static void main(String[] args) throws Exception | args 
        Scanner scanner = new Scanner(System.in);
        //DEFINE EL FACTOR DE CONVERSION
        final int MILLES_A_METRES = 1609;

        //ENTRADA
            System.out.println("introduce millas a convertir: ");
            int millas = scanner.nextInt();
        //PROCESO
            int metres = millas * MILLES_A_METRES;
        //SALIDA
            System.out.println(millas + " millas son " + metres + " metros");
}

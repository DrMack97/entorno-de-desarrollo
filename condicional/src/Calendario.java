import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //ENTRADAS/VARAIBLES
        int dias;
        System.out.println("INGRESA UN MES: ");
        String mes = scanner.next().toLowerCase();

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "Febrero":
                dias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
                
            default:
                dias = 0;
                System.out.println("MES INCORRECTO");
                break;
        }
        if (dias != 0) {
            System.out.println("El mes de " + mes + " tiene " + dias + " días.");
        }
        scanner.close();
    }
}

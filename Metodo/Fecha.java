import java.util.Scanner;

public class Fecha {
    static boolean fecha( int año, int mes, int dia){
        
        
        if (dia <=0 || dia > 30) {
            return false;
        } 

        if (mes < 1 || mes > 12) {
            return false;            // solo puse verificaciones
        }
            
        return true;                // daba error por no introducir el caso correcto 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mes, dia, año;

        System.out.println("introduce un fecha correcta");
        System.out.println("año ");
        año = sc.nextInt();
        System.out.println("mes ");
        mes = sc.nextInt();
        System.out.println("dia ");
        dia = sc.nextInt();

        boolean fechaCorrecta = fecha(año, mes, dia);

        if (fechaCorrecta ) {
            System.out.println(" la fecha dia: "+ dia+ "/"+ mes + " /"+ año +" es correcta");
            
        }else {
            System.out.println("fecha incorrecta");
        }
        //System.out.println("la fecha es " + fecha(año, mes, dia));

        sc.close();
    }
}

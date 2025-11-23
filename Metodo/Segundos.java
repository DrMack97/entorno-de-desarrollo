import java.util.Scanner;

public class Segundos {
    static void Ahms(int tiempo){ // USAR VOID PORQUE ES UN METODO QUE MUESTRA ALGO EN CONCRETO
        // calculo horas 
        int horas = tiempo / 3600;

        //calculo minutos restantes
        int minutosRestantes = tiempo % 3600; // % para calcular el resto despues de las horas
        int minutos = minutosRestantes / 60;

        // calcular segundos restantes

        int segundos = tiempo % 60;

        System.out.printf("%d segundos = %d h: %d m: %d s%n",tiempo,horas,minutos,segundos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa los segundos");

        int segundos = sc.nextInt();

        //calculo 
        Ahms(segundos);

        sc.close();

    }

}

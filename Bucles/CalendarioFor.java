import java.util.Scanner;

public class CalendarioFor {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String[] diaSema = {"lun","mar","mier","jue","vier","sab","dom"};
    int totalDias = 31;
    int i = 1;
    System.out.println("calendario");

    for (; i < totalDias; i++) {

        String diaActual = diaSema[i%7];

        System.out.println("hoy es: " +(i)+ " "+ diaActual);
    }
        
    sc.close();
}

}

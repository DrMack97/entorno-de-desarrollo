import java.util.Scanner;

public class negativoOpositivo {

    static int obteSigne(int x){
        if (x < 0) {

            return -1;
        }else if (x == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "dame un numero te dire si es positivo, negativo o 0");
        int x = sc.nextInt();

        System.out.println(obteSigne(x));
        sc.close();
    }
}

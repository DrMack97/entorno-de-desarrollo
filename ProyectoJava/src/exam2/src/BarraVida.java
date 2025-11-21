import java.util.Scanner;

public class BarraVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vida = 10;
        char c =  'x';
        do {
            
        
        for (int i = 0; i < vida; i++) {

            if (i < vida) {
                System.out.print(c);
            } else {
                System.out.print('_');
            }
        }    
        
            } while (vida > 0);
        
        System.out.println("(" + vida + ")");     
    }

}

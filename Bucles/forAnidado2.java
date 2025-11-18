public class forAnidado2 {
    public static void main(String[] args) {
        
        int cantidad = 0;

        for ( int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 10; j++) {
                cantidad++;
                System.out.println("gank1: "+cantidad);
            }
            if(i % 2 == 0) cantidad +=2;
            System.out.println("que cono: "+ cantidad);
        }
    }
}

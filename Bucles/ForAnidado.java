public class ForAnidado {
    public static void main(String[] args) {
    int a = 4 , b = 3;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                
                System.out.println("Vuelta i: "+i);
                
            }
        }
        //cuenta del 1 al 1000
        int cantidad = 0;

        //for (int i = 1; i < 100 ; i++) {    // por cada vuelta externa se daran 10 vueltas internas 
            //for (int j = 1; j < 10; j++) { //bucle se multiplica i * j
                //cantidad++;
               // System.out.println(cantidad);
            //}
        //}

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j+=2) {
                cantidad+=3;
                System.out.println("blucle intero: "+cantidad);
            }
                cantidad+=4;
                System.out.println("bucle externo: "+cantidad);
        }
    }
}

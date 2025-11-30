package methods;

public class basics {
    
    static void imprimirSimbolo( char simbol, int veces){
       System.out.println(sucesionCaracteres(simbol, veces));
    }
    static String sucesionCaracteres( char simbolos, int v){
        for (int i = 0; i < v; i++) {
            System.out.print(simbolos);
    }
    System.out.println();
    
    String sucession = "";
    sucession += simbolos;
        return sucession;
    }
    public static void main(String[] args) {

        imprimirSimbolo('N', 10);
        imprimirSimbolo('L', 5);
        imprimirSimbolo('n', 3);

        String valorString = sucesionCaracteres('c', 0);

        System.out.println(valorString);
    }

}

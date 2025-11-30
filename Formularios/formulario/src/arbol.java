import java.util.Scanner;

public class arbol {
    static void arboLITO(int alturaT, String arbol, String tronco) {
        System.out.println();
        /**
         * // ESPACIOS: Centramos cada línea restando la posición actual
         * // Fórmula: espacios = (altura - 2 - i) para centrado progresivo
         */
        // copa del arbol
        for (int i = 0; i < alturaT-2 ; i++) {             // La copa ocupa altura-2 líneas para dejar espacio al tronco
            for (int j = 0; j < (alturaT - 1 - i); j++) {   // ESPACIOS: Centramos cada línea restando la posición actual
                                                            // Fórmula: espacios = (altura - 2 - i) para centrado progresivo
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {   // CARACTERES: Usamos progresión impar (1,3,5,7...) para forma
                                                    // triangular
                                                    // Fórmula: (2*i + 1) genera 1,3,5,7... caracteres por línea
                System.out.print(arbol.charAt(0));
            }
            System.out.println();
        }

        int alturaTronco = 3;
        int anchoTronco = 3;

        for (int i = 0; i < alturaTronco; i++) { // altura tronco
            for (int j = 0; j < (alturaT-2); j++) { // centrado de espacios
                System.out.print(" ");
            }
            for (int j = 0; j < anchoTronco; j++) { // parte que printea el tronco
                System.out.print(tronco.charAt(0));
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("///arboLITO///");

        System.out.println("elige caracter arbol");
        String arbol = sc.nextLine();

        System.out.println("elige caracter tronco");
        String tronco = sc.nextLine();

        System.out.println("indica altura");
        int altura = sc.nextInt();

        System.out.println();

        arboLITO(altura, arbol, tronco);
        sc.close();
    }

}

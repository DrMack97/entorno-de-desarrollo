import java.util.Scanner;

public class calculosGeometricos {

    static void menuFiuras() {
        System.out.println(" 0. salir \n 1. calculos con rectangulo \n 2. calculos con circulos");
    }

    /**
     * calcula el perimetro del rectangulo
     * segun los parametros ingresados por el usario
     * 
     * @param largo
     * @param ancho
     * @return
     */

    static int perimetroRectangulo(int largo, int ancho) {
        int p = 2 * (largo + ancho);
        return p;
    }

    /**
     * calcula el AREA del rectangulo
     * segun los parametros ingresados por el usario
     * 
     * @param largo
     * @param ancho
     * @return
     */
    static int areaRectangulo(int largo, int ancho) {
        int areaR = largo * ancho;
        return areaR;
    }

    /**
     * regresa el perimetro del circulo solo con el area
     * ingresado por el usaurio
     * 
     * @param radio
     * @return
     */
    static double perimetroCirculo(double radio) {
        double perimetroC = 2 * radio * Math.PI;

        return perimetroC;
    }

    static double areaCirculo(double radio) {
        double AreaC = Math.PI * (Math.pow(radio, 2));

        return AreaC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            menuFiuras();
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("para obtener su perimetro y su area ingresa: ");
            System.out.println();
                System.out.println("Ancho: ");
                    int a = sc.nextInt();
                System.out.println("Largo: ");
                    int l = sc.nextInt();
            System.out.println();
            //salida rectangulo
                System.out.println("Ancho =" + a + " Largo = " + l);
                System.out.println("Perimetro = " + perimetroRectangulo(l, a));
                System.out.println("Area = " + areaRectangulo(l, a));
                

            } else if (opcion == 2) {
                System.out.println("para obtener PERIMETRO y AREA ingresa: ");
                System.out.println("Radio");
                double radio = sc.nextDouble();
                System.out.println("al ser el radio  "+ radio);
                System.out.println();
                System.out.printf("Perimetro = %.2f%n",perimetroCirculo(radio));
                System.out.println();
                System.out.printf("Area = %.2f%n",areaCirculo(radio));
                System.out.println();


            } else  {
                System.out.println("opcion invalida");
                break;
            }

        } while (opcion != 0);

        sc.close();
    }
}

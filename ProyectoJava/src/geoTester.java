import Packges.Example.geoMetrics;

public class geoTester {
    public static void main(String[] args) {
        // calcular con cuadrado
        double ladoCuadrado = 5.0;

        double perimetroCuadrado = geoMetrics.perimetroCuadrado(ladoCuadrado);

        System.out.format(
                "El perímetro del cuadrado de lado %.2f es %.2f\n",
                ladoCuadrado, perimetroCuadrado);
        double areaCuadrado = geoMetrics.areaCuadrado(ladoCuadrado);

        System.out.format(
                "El área del cuadrado de lado %.2f es %.2f\n",
                ladoCuadrado, areaCuadrado);

        // calcular con rectángulo
        double a = 4.0, b = 3.0;

        double perimetroRectangulo = geoMetrics.perimetroRectangulo(a, b);
        System.out.format(
                "El perímetro del rectángulo de base %.2f y altura %.2f es %.2f\n",
                a, b, perimetroRectangulo);

        double areaRectangulo = geoMetrics.areaRectangulo(a, b);
        
        System.out.format(
                "El área del rectángulo de base %.2f y altura %.2f es %.2f\n",
                a, b, areaRectangulo);

        // calcular con círculo
        double radioCirculo = 3.0;
        double perimetroCirculo = geoMetrics.perimetroCircunferencia(radioCirculo);
        System.out.format(
                "El perímetro de la circunferencia de radio %.2f es %.2f\n",
                radioCirculo, perimetroCirculo);
        double areaCirculo = geoMetrics.areaCirculo(radioCirculo);
        System.out.format(
                "El área del círculo de radio %.2f es %.2f\n",
                radioCirculo, areaCirculo);

    }

}

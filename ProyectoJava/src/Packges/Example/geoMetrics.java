package Packges.Example;

public class geoMetrics {
    public static double perimetroCuadrado(double lado) {
        return 4.0 * lado;
    }
    
    /**
     * calcula el área de un cuadrado, dado el lado
     * @param lado el lado del cuadrado
     * @return el área
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }
    
    /**
     * calcula el perímetro del rectángulo
     * @param base la base del rectángulo
     * @param altura la altura del rectángulo
     * @return el perímetro
     */
    public static double perimetroRectangulo(double base, double altura) {
        return 2.0 * (base + altura);
    }
    
    /**
     * calcula el área del rectángulo
     * @param base la base del rectángulo
     * @param altura la altura del rectángulo
     * @return el área
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    } 
    
    /**
     * calcula el perímetro de la circunferencia
     * @param radio el radio de la circunferencia
     * @return el perímetro
     */
    public static double perimetroCircunferencia(double radio) {
        return 2.0 * Math.PI * radio;
    }
    
    /**
     * calcula el área del círculo
     * @param radio el radio del círculo
     * @return el área
     */
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }      

}

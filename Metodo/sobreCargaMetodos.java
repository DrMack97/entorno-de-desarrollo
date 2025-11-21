public class sobreCargaMetodos {
    static String saludar() {
        return "hola, como estas??";
    }

    static String saludar(String nombre) {
        return "ola " + nombre + ", como estas??";
    }

    static String saludar(String nombre, String city) 
    {
        return "ola " + nombre + " de "+ city;
    }
    public static void main(String[] args) {
        saludar();
    }

}

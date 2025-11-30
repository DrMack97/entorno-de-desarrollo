import com.utils.forms.FormInteractiveBuilder;

public class formularioInteractivo {
    public static void main(String[] args) {
        
        System.out.println("/=====FORMULARIO INTERACTIVO=====/");

        FormInteractiveBuilder pruebaU = new FormInteractiveBuilder();

        pruebaU.setTituloPrincipal("Formulario de registro de usuario", '*');

        String nombre = pruebaU.getValueString("Nombre");
        String edad = pruebaU.getValueInt("edad");
        String correo = pruebaU.getValueString("Email");

        pruebaU.agregarSeparador();
        pruebaU.agregarSeccion("Informacion Adicional", '-');

        String pais = pruebaU.getValueString("Pais");
        String ciudad = pruebaU.getValueString("Ciudad");
        String salario = pruebaU.getValueDouble("Salario mensual (eu)");

        pruebaU.agregarSeparador();
        pruebaU.agregarMensaje("AGREGADO EXITOSAMENTE!");

        System.out.println("\n"+"=".repeat(50));
        System.out.println("resumen de datos registrados");
        System.out.println("=".repeat(50));

        FormInteractiveBuilder resumen = new FormInteractiveBuilder();
        resumen.setTituloPrincipal("Datos del usuario registrado", '+')
                .agregarCampo("NOMBRE COMPLETO", nombre)
                .agregarCampo("EDAD", edad+" anys ")
                .agregarCampo("Email ", correo)
                .agregarCampo("PAIS", pais)
                .agregarCampo("CIUDAD", ciudad)
                .agregarCampo("SALARIO", salario)
                .agregarSeparador(30)
                .agregarMensaje("GRACIAS POR REGISTAR SUS DATOS")
                .construir();

        pruebaU.cerrarScanner();

    }
}

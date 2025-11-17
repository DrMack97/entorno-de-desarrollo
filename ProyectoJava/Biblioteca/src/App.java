import com.utils.forms.FormsBuilder;

public class App {
    public static void main(String[] args) throws Exception {

        FormsBuilder.printTitle("\nformulario de usuario ");

        FormsBuilder.printValue("\nNombre","Juanito Perez");
        FormsBuilder.printValue("Edad","30");
        FormsBuilder.printValue("correo electronico", "J.Perez@gmail.com");
        FormsBuilder.divider('-');
        FormsBuilder.printTitle("informacion adicional ");
        FormsBuilder.printValue("\nPais", "España");
        FormsBuilder.printValue("ciudad", "barcelona");
        FormsBuilder.divider('-');
        FormsBuilder.printValue("Registro Completado", "gracias por registrarte");

    }
}

import com.utils.forms.FormsBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        String name, mail;
        int age;
        double quota;

        // Input data
        FormsBuilder.printValue("nom", mail);
        FormsBuilder.printValue("edat", Integer.toString(age));
        FormsBuilder.printValue("email", name);
        FormsBuilder.printValue("quota", Double.toString(quota));

        FormsBuilder.getValueString("validacion");

        // hacer logica que torna a verificar si los datos con correctos 

        FormsBuilder.divider(separadorChar);

        FormsBuilder.divider(separadorChar);

        FormsBuilder.printValue("el socio", name);
        double discount = discounts.calcDiscount(quota);
        FormsBuilder.printValue("descompte", Double.toString(discount));

        // Hacer en casita
    }
}

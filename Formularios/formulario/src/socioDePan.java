import java.util.Scanner;

import com.utils.forms.FormInteractiveBuilder;

public class socioDePan {
    public static double descuentoCota(double cuotaP) {
        if (cuotaP >= 0 && cuotaP >= 20) {
            return 0;
        } else if (cuotaP > 20 && cuotaP >= 75) {
            return 5;
        } else if (cuotaP > 75 && cuotaP <= 100) {
            return 10;
        } else {
            return 0; // RANGOS
        }
    }

    public static String categoria(Double cuota) {
        if (cuota >= 0 && cuota >= 20) {
            return "PlanBasic";
        } else if (cuota > 20 && cuota >= 75) {
            return "Socio Primium";
        } else if (cuota > 75 && cuota <= 100) {
            return "Socio VIP";
        } else {
            return "No valido";
        }
    }

    public static void main(String[] args) {
        System.out.println("BIENVENIDO A LA PANADERIA ");

        FormInteractiveBuilder socioPa = new FormInteractiveBuilder();
        // entrada de datos
        socioPa.setTituloPrincipal("Registra tus datos!",'='); 
                                                                            // cuidado con el uso correcto es ''

        String nombre = socioPa.getValueString("Nombre");
        String edad = socioPa.getValueInt("Edad");                  //debe ser int
        String email = socioPa.getValueString("Email");
        String cuota = socioPa.getValueDouble("Cuota que paga");    //debe ser double
        
        socioPa.agregarSeparador(40);
        socioPa.agregarSeccion("validacion de datos", '^');

        //resumen
        FormInteractiveBuilder resumen = new FormInteractiveBuilder();
        resumen.agregarCampo("Nombre", nombre)
                .agregarCampo("Edad", edad)
                .agregarCampo("Email", email)
                .agregarCampo("Cuota", cuota);

        System.out.println("\n Confirmas que los datos son correctos? (si/no)");
        String confirmacion = new java.util.Scanner(System.in).nextLine();

        socioPa.agregarSeparador(40);

        if (confirmacion.equalsIgnoreCase("si")) {
            //double descuento = calcularDescuento(cuota);
            //String tipoSocio = obtenerTipoSocio(cuota);

            socioPa.agregarSeccion("Registro Completado!",'!');
            socioPa.agregarCampo("Socio", nombre)
                    //.agregarCampo("Categoria",)
                    //.agregarCampo("descuento aplicable", descuento)
                    .agregarSeparador(40);
        } else {
            socioPa.agregarSeccion("Registro cancelado",'X');
            socioPa.agregarMensaje("Inicia nuevamente");
        }
        socioPa.construir();
        socioPa.cerrarScanner();
    }
}

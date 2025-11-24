package com.utils.forms;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. registro de usario ");
        // para invocar el formulario es igual que Scanner
        // Scanner sc = new Scanner(System.in)
        
        formBuilder fomulario1 = new formBuilder();

        fomulario1.setTituloPrincipal("formulario de registro de usuario")
                    .agregarCampo("NOMBRE", "David Delgado")
                    .agregarCampo("EDAD", "28")
                    .agregarCampo("CORREO ELECTRONICO", "davidadelgadoa97@gmail.com")
                    .agregarSeparador()
                    .agregarSeccion("informacion personal")
                    .agregarCampo("PAIS", "Españita")
                    .agregarCampo("CIUDAD", "Barcelona")
                    .agregarSeparador()
                    .agregarMensaje("Registre Complet: Gràcies per registrar les teves dades!")
                    .construir();
    }

}

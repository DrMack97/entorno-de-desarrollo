package com.utils.forms;

public class ejemploBasicO {

    public static void main(String[] args) {
        System.out.println("3. Datos basicos");
        formBuilder formulario3 = new formBuilder();

        formulario3.setTituloPrincipal("Datos Personales basicos ")
                    .agregarCampo("NOMBRE", "DANIELA")
                    .agregarSeparador()
                    .agregarCampo("TLF", "670581873")
                    .agregarSeparador()
                    .agregarCampo("MADRE DE", "NOLAND")
                    .agregarSeparador()
                    .agregarCampo("CIUDAD", "OCATA")
                    .agregarMensaje("PRATICANDO")
                    .construir();
    }

}

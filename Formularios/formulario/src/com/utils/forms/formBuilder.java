package com.utils.forms;

public class formBuilder {
    private boolean tieneTituloPrincipal;
    
    public formBuilder(){
        this.tieneTituloPrincipal = false;
    }

    public formBuilder setTituloPrincipal (String titulo){ //titulo principal
        if(!tieneTituloPrincipal){            //crearlinea //===============
            System.out.println("\n"+titulo);
            System.out.println(crearLinea('=',titulo.length()));
            tieneTituloPrincipal = true;
        }
        return this;
        /**al final agregarSeccion,campo,mensaje,separador 
         * son las funciones que le dan cuerpo al formulario
         * podria decirse que se crea una caja de herramientas personalizable para el resultado final  */
    }
    public formBuilder agregarSeccion(String tituloSeccion){ 
        System.out.println("\n"+ tituloSeccion);                              // subTitulo
        System.out.println(crearLinea('=',tituloSeccion.length())); // ===========
        return this;
    }
    public formBuilder agregarCampo(String etiqueta, String valor ){
        System.out.println(etiqueta + " : "+ valor);         // cuerpo del formulario 
        return this;
    }
    public formBuilder agregarMensaje (String mensaje){
        System.out.println(mensaje);
        return this;                                        //THIS permite encadenar las herramientas 
    }                                                       //y puedan ser mejor implementadas en el main
    public formBuilder agregarSeparador (){                // crea un separador de 30 caracteres 
        System.out.println(crearLinea('*', 30));
        return this;
    } 
    public void construir(){
        System.out.println();
    }
    private String crearLinea (char caracter, int longitud){ // permite a crear el subrayado 
        String linea = "";
        for (int i = 0; i < longitud; i++) {
            linea += caracter;
        }
        return linea;
    }
    public void limpiar(){
        tieneTituloPrincipal = false;
    }
}

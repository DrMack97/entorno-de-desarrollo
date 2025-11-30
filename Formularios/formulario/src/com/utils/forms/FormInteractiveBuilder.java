package com.utils.forms;

import java.util.Scanner;

public class FormInteractiveBuilder {
    private boolean tieneTituloPrincipal;
    private Scanner sc;

    public FormInteractiveBuilder(){
        this.tieneTituloPrincipal = false; this.sc = new Scanner(System.in);
        
    }
        // Método para establecer título principal con carácter personalizable
    public FormInteractiveBuilder setTituloPrincipal(String titulo, char tituloSubrayado) {
        if(!tieneTituloPrincipal){
            System.out.println("\n"+titulo);
            System.out.println(crearLinea(tituloSubrayado,titulo.length()));
            tieneTituloPrincipal = true;
        }
        return this;
    }
    public FormInteractiveBuilder setTituloPrincipal2 (String titulo){
        return setTituloPrincipal(titulo,'=');
    }
    public FormInteractiveBuilder agregarSeccion(String tituloSeccion, char tituloSubrayado){
        System.out.println("\n"+tituloSeccion);
        System.out.println(crearLinea(tituloSubrayado,tituloSeccion.length()));
        return this;
    }
    public FormInteractiveBuilder agregarSeccion(String tituloSeccion){
        return agregarSeccion(tituloSeccion, '=');
    }
    public FormInteractiveBuilder agregarCampo(String etiqueta, String valor){
        System.out.println(etiqueta + ": "+valor);
        return this;
    }

    public String getValueString(String etiqueta){
        System.out.println(etiqueta+": ");
        String valor = sc.nextLine();
        return valor;
    }
    public String getValueInt(String etiqueta){
        System.out.println(etiqueta+": ");
        String valor = sc.nextLine();
        return valor;
    }
    public String getValueDouble(String etiqueta){
        System.out.println(etiqueta+": ");
        String valor = sc.nextLine();
        return valor;
    }
    public FormInteractiveBuilder agregarSeparador(){
        System.out.println(crearLinea('-',30));
        return this;
    }
    public FormInteractiveBuilder agregarSeparador(int longitud){
        System.out.println(crearLinea('-',longitud));
        return this;
    }
    public FormInteractiveBuilder agregarMensaje(String mensaje){
        System.out.println(mensaje);
        return this;
    }
    public void construir(){
        System.out.println();
    }
    public void cerrarScanner(){
        sc.close();
    }
    public String crearLinea(char caracter, int longitud){
        String linea = "";
        for (int i = 0; i < longitud; i++) {
            linea += caracter;
        }
        return linea;
    }
}

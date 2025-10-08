import java.util.Scanner;

public class prueba1 {
    /*Ens demanen un programa per a usuaris de música folk irlandesa. per tal de determinar els ritmes de les
cançons que es toquen, es proporciona el compàs i en funció d’aquest es determina el nom.
De foroma que un 4/4 és un Reel , un 6/8 és un Jig, un 9/8 és un Slip Jig i un 12/8 és un Slide
En cas que no es reconegui el compas, s’ha de posar unknown…
Feu un programa que demana a l’usuari el compàs en dues tandes */

    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        //variables
        int pulsacion = 0;
        int duracionNota = 0;
        String ritmo;
        System.out.println("///////////////////////////////////////Irland FOLK/////////////////////////////////////////////");
        
        //entradas
        
        System.out.println("indique una PULSACION: ");
        pulsacion = us.nextInt();
        System.out.println("indirque su DURACION: ");
        duracionNota = us.nextInt();

        //proceso 

        if (pulsacion == 4 && duracionNota == 4) {
            System.out.println("TIENES UN REEL ");
            ritmo = "Reel";
        
            }else if (pulsacion == 6 && duracionNota ==8) {
            System.out.println("TIENES UN JING");
            ritmo = "JING";
            
            }else if (pulsacion == 9 && duracionNota == 8) {
            System.out.println("TIENES UN SLIP JIG");
            ritmo = "SLIP JIG";

            }else if (pulsacion == 12 && duracionNota == 8) {
            System.out.println("TIENES UN SLIDE");
            ritmo = "Slide";
            
        }else {
            System.out.println("UNKNOW");
        }
        //salida

        System.out.println("PULSACIONES: " + pulsacion+" \nDURACION: "+duracionNota);
        

        
    }
}

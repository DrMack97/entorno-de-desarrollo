import java.util.Scanner;

public class EjercicioDeepSeek {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        // variables
        final double pago = 18.50; //hora
        final double bonoExtra = 200; // al superar las 180 hrs
        final int horaN = 160;
        final double factorHora_Extra = 1.4;
        final double horasBono = 180;

        //impuestos
        final double seguroSocial = 0.05;
        final double topeSS = 150; // - del salario bruto
        final double libresDeimpuestos = 650; // primeros 650 libre de impuestos
        final double impuesto1 = 0.20; // los siguientes 500
        final double impuesto2 = 0.30; // los siguientes 400
        final double impuesto3 = 0.35; // el resto
        final double etapa1 = 500;
        final double etapa2 = 400;

        System.out.println("/////////////////////CALCU SUELDOS//////////////////");
        //entradas
        System.out.println("NOMBRES Y APELLIDOS:");
        String nombre = us.next();

        System.out.println("intruducir horas: ");
        double horaTrabajadas = us.nextDouble();
        
        //calculo salario bruto 
        double sueldoBase, horasExtra, bono = 0;// al sacar esto puedo poner la variable sueldoBruto
        
        if (horaTrabajadas <= horaN){
            sueldoBase = horaTrabajadas*pago;
            horasExtra = 0;
        }else {
            sueldoBase = horaN*pago;
            horasExtra = (horaTrabajadas - horaN)*(pago*factorHora_Extra);
        }
        if (horaTrabajadas>= horasBono) {
            bono = bonoExtra;
            
        }
        double SueldoBruto = sueldoBase + horasExtra + bono;
        
        //impuesto seguridad social 
        double baseImponible = SueldoBruto - topeSS;
        double impuesto = 0;
        
        double tramo1 = 0 , tramo2 = 0, tramo3 = 0;
        
        if (baseImponible>libresDeimpuestos) {
            double resto = baseImponible - libresDeimpuestos;
            
            if (resto> etapa1) {
                tramo1 = etapa1*impuesto1; // 500 * 0.20
                resto -= etapa1;
                
                if (resto> etapa2) {
                    tramo2 = etapa2*impuesto2;
                    resto -= etapa2;
                    
                    //tramo 3
                    tramo3 = resto*impuesto3;
                }else{
                tramo2 = resto*impuesto2;
                }

        } else {
            tramo1 = resto*impuesto1;
        }
    }
        impuesto = tramo1 + tramo2 + tramo3;

        double sueldoNeto = SueldoBruto - impuesto -topeSS;
        
        us.close();
    }
}


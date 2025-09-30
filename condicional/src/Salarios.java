import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double Horas = 150;
        final double PRECIO_HORA = 15;
        double salario; 
        final double imp; 

        if (Horas <= 130){
            salario = Horas*PRECIO_HORA;
        }
        else {
            salario = Horas*1.5+(Horas-130)*1.5*PRECIO_HORA;
        }
        System.out.println(salario);
        
        //condicional de impuesto al salario base 
        if (salario <= 900){

            imp = (salario-500) * 0.25;
            salario = salario - imp;

        } 
        else{
            imp = (salario-900)*0.45 + 400 * 0.25;
            salario = salario - imp;
        }

        System.out.println(salario);

    }

}


import java.util.Scanner;

public class EjercicioExam {
    // programa quue pregunta el peso del usuario y indique un menu con diferentes medicamentos: 
    // 1. xaraleto 2. ibuprofeno 3. fluoxetina 4. amoxicilina
    //se ah de tomar ibuprofeno si el peso es mayor a 70 kg una pastilla de 500 mg en caso contrario 1 mg
    //se ha de tomar xaraleto si su peso es inferior a 60 kg tomara 10 mg si pesa entre 60 y 80 kg tomara 15 mg y si pesa mas de 80 kg tomara 20 mg
    //se ha de tomar amoxicilina si su peso es inferior a 65kg 500mg caso contrario 1g
    //se ha de tomar fluotexina si su peso es inferior a 80kg a de tomar 20mg en caso contrario 40mg
    // mostrar en el programa System.out.println("con el peso{peso}kg debe tomar {medicamento} de {dosis}mg");
    //System.out.println("con el peso>70 o peso<80 debe tomar ibuprofeno,fluotexina,xaraleto de dosis: 500,20,15
    //System.out.println("con el peso<60 debe tomar amoxicilina,xaraleto,fluotexina,ibuprofeno de dosis: 500,10,20,1);
    //System.out.println("con el peso>65 o peso<70 debe tomar amoxicilina, ibuprofeno, fluotexina, xaraleto de dosis: 1,1,20,15 );
    //System.out.println("con el peso>80 debe tomar amoxicilina, ibuprofeno, fluotexina, xaraleto de dosis: 1,500,40,20
    public static void main(String[] args) {
        Scanner Us = new Scanner(System.in);
        //entrada
        System.out.println("///////////////////////////EVALUACION DEL PESO///////////////////////////////");
        System.out.println("1. xaraleto 2. ibuprofeno 3. fluoxetina 4. amoxicilina");
        System.out.println("Inque su peso pues");
        int Peso = Us.nextInt();

        //procedemiento //salidas
        if (Peso >=60 && Peso <=65) {
            System.out.println("///////////////////RECETA PARA DIABETICOS//////////////////");
            System.out.println("con el peso: "+ Peso +"Kg"+"\ndebe tomar: "+"\nxaraleto: 15 mg" + "\nibuprofeno: 1mg"+"\nFlotexina: 20mg"+"\namoxicilina: 500mg");
                } else if (Peso >=65 && Peso <= 70) {
                    System.out.println("///////////////////RECETA PARA DIABETICOS//////////////////");
            System.out.println("con el peso: "+ Peso +"Kg"+"\ndebe tomar: "+"\nxaraleto: 15mg" + "\nibuprofeno: 1mg"+"\nFlotexina: 20mg"+"\namoxicilina: 1mg");
                } else if (Peso >=70 && Peso <= 80) {
                    System.out.println("///////////////////RECETA PARA DIABETICOS//////////////////");
            System.out.println("con el peso: "+ Peso +"Kg"+"\ndebe tomar: "+"\nxaraleto: 15mg" + "\nibuprofeno: 500mg"+"\nFlotexina: 20mg"+"\namoxicilina: 1mg");
                } else if (Peso >=80) {
                    System.out.println("///////////////////RECETA PARA DIABETICOS//////////////////");
            System.out.println("con el peso: "+ Peso +"Kg"+"\ndebe tomar: "+"\nxaraleto: 80 mg" + "\nibuprofeno: 500mg"+"\nFlotexina: 40mg"+"\namoxicilina: 1mg");
        }else{
        System.out.println("que coño mi loco");

            Us.close();
            //fin
        }
    }
}



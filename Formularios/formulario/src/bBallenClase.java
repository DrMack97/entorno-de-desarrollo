import java.util.Random;

public class bBallenClase {

    public static int probabilidadSemaforo(int pasos){
        int semaforo = -1;

        Random rnd = new Random();

        int prob = rnd.nextInt(10);

        if (pasos < 4) {
            //green
            if (prob >= 0 && prob <= 4) semaforo= 0; //0 green
            else if (prob >= 5 && prob <= 7) semaforo =1; //amarillo
            else semaforo = 2;                       //red
            
        }else{
            if (prob >= 0 && prob <= 4)  semaforo = 2; //red
            else if (prob >= 5 && prob <= 7) semaforo =1; // amarillo
            else semaforo = 0;                          // verde
        }
        // logica o resultado inverso 
    }

}

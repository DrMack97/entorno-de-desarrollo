package Ra2Bucles;
import java.util.Random;
import java.util.Scanner;

public class App2 {
public static void main(String[] args) {

    int sumaResultats = 0, parellSenar; 
    int cpuNum, usrNum, cpuOp, usrOp; //Num para el numero Op para par o impar
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int maxPartides = 6, maxWin = 3; 
    int partides = 0, cpuWin = 0, usrWin = 0;
    boolean exitGame = false;

    do{

        //Pedir valores
        cpuNum = rd.nextInt(0,10+1);
        cpuOp = rd.nextInt(0,1+1);

        System.out.println("Digues el numero:");
        usrNum = sc.nextInt();
        System.out.println("Parell(0) o senar(1):");
        usrOp = sc.nextInt();

        //Calcular par o impar
        sumaResultats = cpuNum + usrNum;
        parellSenar = sumaResultats % 2; // 0 par 1 impar

        if(parellSenar == 0) System.out.println("Parell!!");
        else System.out.println("Senar!!");
        //Calcular ganador

        if(usrOp == cpuNum){
            System.out.println("Empat");
        }else{
            if(usrOp == parellSenar){
                System.out.println("Guanya usuari");
                usrWin++;
            }else{
                System.out.println("Guanya Cpu");
                cpuWin++;
            }
        }

        partides++;

        if(partides >= maxPartides) exitGame = true;
        else if(usrWin >= maxWin || cpuWin >= maxWin) exitGame = true;
    
    }while(!exitGame);

    if(usrWin >= 3){
        System.out.println("Ha guanyat usuari");
    }else if(cpuWin >= 3){
        System.out.println("Ha guanyat la CPU");
    }else{
        System.out.println("Hi ha hagut un empat i s'han acabat les tirades");
    }
    
    
}
}

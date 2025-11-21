public class pasoPorValor {

    static int doble(int a){
        a = a* 2;
        return a;
    }

    public static void main(String[] args) {

        int num = 5;
        int numDoble = doble(num);

        System.out.println(numDoble);
        System.out.println(doble(num));
    }   //numDoble vale 10, pero num vale 5


}

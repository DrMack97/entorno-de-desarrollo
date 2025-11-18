public class forAnidado3 {
    public static void main(String[] args) {

        int a = 5, b = 5, c = 3;

        for (int i = 0; i <= a; i++)
            for (int j = 0; j <= b; j++) {
                c = a++;

                b--;
                System.out.println("C es: " + c);
                System.out.println("b es: " + b);
                System.out.println("a es: " + a);

            }
    }

}

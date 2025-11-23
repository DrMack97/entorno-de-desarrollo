import java.util.Scanner;

public class mayorDeTres {
    static int mayor(int x, int y, int z) { // hacer de nuevo 

        if (x >= y && x >= z)
            return x;
        if (y >= x && y >= z)
            return y; // forma mas directa de hacer una comparacion
        return z;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nummero mayor ");
        int z = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("mayor " + mayor(x, y, z));

        sc.close();
    }

}

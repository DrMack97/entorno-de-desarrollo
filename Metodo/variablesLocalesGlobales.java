public class variablesLocalesGlobales {
    static int x; //es una variable global
    static int cubo (int z) //metodo perimetro de un cubo
    {
        int x; // variable local del metodo cubo
        x = z*z*z;
        return x; // siendo x una variable local
    }
    public static void main(String[] args) 
    {
        int p;        //variable local de metodo main
        p = 10;
        z = 100;    //error z no esta declarada en este ambito 
        x = cubo(p); // x es global -> vale 1000
    }
}

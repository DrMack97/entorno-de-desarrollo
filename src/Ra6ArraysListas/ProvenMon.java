package Ra6ArraysListas;
public class ProvenMon {

    private String name; 
    private String [] attacksNames; 
    private int [] attackDamage; 
    private int life;

    public ProvenMon(String name) {
        this.attacksNames = new String[4];
        this.attackDamage = new int[4];
        this.name = name;
        this.life = 20;
    }

    /**Metode que afegeix un atac i un dany als arrais corresponents segons l'indx
     * Permete inicialitzar els atacs proporcionant un nom i un dany, si l’index esta fora de rang ha de mostrar un missatge que no s’ha pogut fer.
     */
    public void setAttackDamageIdx(String attack, int damage, int idx){
        if (idx >= 4) {
            System.out.println("imposible de hacer");
            return;
        }else{
            attacksNames[idx] = attack;
            attackDamage[idx] = damage;
            System.out.println("Ataque: "+attack+" con daño: "+damage+" Guardado correctamente");
        }
        
    }

    /**
     * Retorna l'el mal produit per l'atac si no coincideix cap atac ha de retornar -1
     * @param attack
     * @return
     */

    public int damageAttack(String attack){

        for (int i = 0; i < attackDamage.length; i++) {
            if (attacksNames[i].equalsIgnoreCase(attack)) {
                System.out.println("el damage de "+ attack+ " es de "+attackDamage[i]+" !");
                return attackDamage[i];
            }
        }
        System.out.println(attack+"no encontrado ");

        return -1;
    }

    /**
     * Mostra els atacs en format graella 
     *  */
    public void showAttacks(){
        System.out.println("=== Attack Menu ===");
        for (int i = 0; i < attackDamage.length; i++) {
            System.out.print(attacksNames[i] +" "+ attackDamage[i]+" ");
            if (i == 1) {
                System.out.println();
            }
        }
        
    }

    public void recieveAttack(int damage){
        life -= damage; 
        if(life < 0) life = 0;
    }


    /**
     * Mostra en una barra quanta vida li queda
     */
    public void showLife(){
        System.out.print("|");
        for (int i = 0; i < life; i++) {
            System.err.print("#");
            
        }
        System.out.print("|");
        System.out.print(" ("+life+")");
    }

    public int getLife(){
        return life;
    }
    public static void main(String[] args) {
        
    }
    


}

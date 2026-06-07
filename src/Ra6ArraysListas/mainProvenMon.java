package Ra6ArraysListas;

public class mainProvenMon {

    static private ProvenMon [] mons;
    static private ProvenMon boss;
    static private ProvenMon current;

    public mainProvenMon(){
        mons = new ProvenMon[3];
        boss = new ProvenMon("malo"); 
        current = mons[0];
        
    }

    public static void main(String[] args) {
        new mainProvenMon();
        boss.getLife();
        boss.setAttackDamageIdx("1", 10, 0);
        boss.setAttackDamageIdx("2", 10, 1);
        boss.setAttackDamageIdx("3", 10, 2);
        boss.setAttackDamageIdx("4", 10, 3);

        boss.showAttacks();
    }

    

}

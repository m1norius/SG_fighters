package units;

import java.util.Random;

public class Fighter implements Unit {

    private String name;

    private int strength;
    private int agility;
    private int criticalChance;

    private int hp = 100;


    public void pumpUnit() {

        Random r = new Random();
        int a = r.nextInt(100);
        int b = r.nextInt(100);
        int c = r.nextInt(100);

        float koeficient = (float) 50/(a+b+c);

        if((int) (a*koeficient) == 0){
            strength = 1;
        }else {
            strength = (int) (a*koeficient);
        }
        agility = (int) (b*koeficient);
        criticalChance = (int) (c*koeficient);

        System.out.println("----Stats----");
        System.out.println("Strength: "+strength);
        System.out.println("Agility: "+agility);
        System.out.println("Critical: "+criticalChance);
    }

    public int attack(){
        System.out.println("----Damage----");
        int realKick;
        Random r = new Random();
        realKick = calculateDamage(r.nextInt(strength+1));
        System.out.println("Real dmg: "+realKick );
        return realKick;

    }

    private boolean isCritical(){
        int chance;
        Random r = new Random();
        chance = r.nextInt(101);
        if(chance < criticalChance){
            System.out.println("Critical chance: ---"+criticalChance+"%--- roll on crit ---"+chance+"--- !!!X2!!!");
            return true;
        }
        System.out.println("Critical chance: ---"+criticalChance+"%--- roll on crit ---"+chance+"---");
        return false;
    }
    private int calculateDamage(int strength){
        int realKick = strength;
        if (realKick > 0){
            if (isCritical()){
                System.out.print("Real dmg: " + realKick);
                realKick = realKick*2;
                System.out.println(" * 2 = "+realKick );
            }
        }else {
            System.out.println("Miss");
        }
        return realKick;
    }

    public boolean defense(){
        System.out.println("----Dodge----");
        int chance;
        Random r = new Random();
        chance = r.nextInt(101);
        if(chance < agility){
            System.out.println("Dodge chance: ---"+agility+"%--- roll on dodge ---"+chance+"--- !!!dodge!!!");
            return true;
        }
        System.out.println("Dodge chance: ---"+agility+"%--- roll on dodge ---"+chance+"---");
        return false;
    }

    public void getName() {
        System.out.println(name);
    }

    @Override
    public void setFullHP() {
        this.hp = 100;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public void setDamage(int damage) {
        this.hp = hp - damage;
    }


    @Override
    public void setName() {
        name = Names.getRandomFighterName();
    }
}

import units.Fighter;
import units.Unit;

import java.util.LinkedList;
import java.util.List;

public class Arena {

    private static List<Unit> fightersOnArena = new LinkedList<>();

    public static void addFightersToArena(Unit unit){
        fightersOnArena.add(unit);
    }

    public static void combat(){
        while (fightersOnArena.size() != 1){

            while (fightersOnArena.get(fightersOnArena.size()-1).getHP() >= 0  && fightersOnArena.get(0).getHP() >= 0){
                fightersOnArena.get(0).getName();
                int attackFirstFighter = fightersOnArena.get(0).attack();
                if(!fightersOnArena.get(fightersOnArena.size()-1).defense()){
                    System.out.println("Удар прошел");
                    fightersOnArena.get(fightersOnArena.size()-1).setDamage(attackFirstFighter);
                }else {
                    System.out.println("Уклон");
                }
                System.out.println(""+fightersOnArena.get(fightersOnArena.size()-1).getHP());
                fightersOnArena.get(fightersOnArena.size()-1).getName();
                System.out.println();
                System.out.println();
                System.out.println();

                fightersOnArena.get(fightersOnArena.size()-1).getName();
                int attackSecondFighter = fightersOnArena.get(fightersOnArena.size()-1).attack();
                if(!fightersOnArena.get(0).defense()){
                    System.out.println("Удар прошел");
                    fightersOnArena.get(0).setDamage(attackSecondFighter);
                }else {
                    System.out.println("Уклон");
                }
                System.out.println(""+fightersOnArena.get(0).getHP());
                fightersOnArena.get(0).getName();
                System.out.println();
                System.out.println();
                System.out.println();

            }

            if(fightersOnArena.get(fightersOnArena.size()-1).getHP() <= 0){
                fightersOnArena.remove(fightersOnArena.get(fightersOnArena.size()-1));
                fightersOnArena.get(0).setFullHP();
            }else if (fightersOnArena.get(0).getHP() <= 0){
                fightersOnArena.remove(fightersOnArena.get(0));
                fightersOnArena.get(fightersOnArena.size()-1).setFullHP();
            }

        }

        System.out.println("Winner");
        fightersOnArena.get(0).getName();
    }
}

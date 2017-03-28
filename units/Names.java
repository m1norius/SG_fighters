package units;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by minorius on 02.03.2017.
 */
public class Names implements Serializable{

    public static long serialVersionUID = 5008632469733847506L;

    private static List<String> fightersNames = new ArrayList<>();

    public static String getRandomFighterName(){
        fightersNames.add("Liu Kang");
        fightersNames.add("Johnny Cage");
        fightersNames.add("Kano");
        fightersNames.add("Raiden");
        fightersNames.add("Scorpion");
        fightersNames.add("Sonya Blade");
        fightersNames.add("Sub-Zero");
        fightersNames.add("Goro");
        fightersNames.add("Shang Tsung");
        fightersNames.add("Reptile");
        fightersNames.add("Baraka");
        fightersNames.add("Jax");
        fightersNames.add("Kitana");
        fightersNames.add("Kung Lao");
        fightersNames.add("Mileena");
        fightersNames.add("Kintaro");
        fightersNames.add("Shao Kahn");
        fightersNames.add("Jade");
        fightersNames.add("Noob Saibot");
        fightersNames.add("Smoke");
        fightersNames.add("Cyrax");
        fightersNames.add("Sektor");
        fightersNames.add("Kabal");
        fightersNames.add("Nightwolf");
        fightersNames.add("Sindel");
        fightersNames.add("Sheeva");
        fightersNames.add("Stryker");
        fightersNames.add("Motaro");
        fightersNames.add("Ermac");
        fightersNames.add("Rain");
        fightersNames.add("Chameleon");
        fightersNames.add("Khameleon");
        fightersNames.add("Fujin");
        fightersNames.add("Jarek");
        fightersNames.add("Shinnok");
        fightersNames.add("Sindel");
        fightersNames.add("Sindel");

        return fightersNames.get(new Random().nextInt(fightersNames.size()));
    }
}

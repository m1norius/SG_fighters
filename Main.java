import factory.FightersFactory;
import factory.UnitFactory;
import units.Unit;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        UnitFactory unitFactory = createUnitByType("Fighter");

        for (int i = 0; i<5; i++){
            Unit unit = unitFactory.createUnit();
            unit.pumpUnit();
            unit.setName();
            unit.getName();
            Arena.addFightersToArena(unit);
        }
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");

        Arena.combat();


    }

    private static UnitFactory createUnitByType(String type){
        if (type.equalsIgnoreCase("Fighter")){
            return new FightersFactory();
        }else {
            throw new RuntimeException("Unknown unit");
        }
    }
}

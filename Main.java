import factory.FightersFactory;
import factory.UnitFactory;
import units.Unit;

public class Main {
    public static void main(String[] args) {


        UnitFactory unitFactory = createUnitByType("Fighter");

        for (int i = 0; i<5; i++){
            Unit unit = unitFactory.createUnit();
            unit.pumpUnit();
            unit.setName();
            unit.getName();
            //Arena.addFightersToArena(unit);
            Communicator.addFighter(unit);
        }
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");

        //Arena.combat();
        Communicator.dataTransfer();


    }

    private static UnitFactory createUnitByType(String type){
        if (type.equalsIgnoreCase("Fighter")){
            return new FightersFactory();
        }else {
            throw new RuntimeException("Unknown unit");
        }
    }
}

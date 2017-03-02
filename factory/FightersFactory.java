package factory;

import units.Fighter;
import units.Unit;

public class FightersFactory implements UnitFactory {
    public Unit createUnit() {
        return new Fighter();
    }
}

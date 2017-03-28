package factory;

import units.Fighter;
import units.Unit;

import java.io.Serializable;

public class FightersFactory implements UnitFactory {
    public Unit createUnit() {
        return new Fighter();
    }
}

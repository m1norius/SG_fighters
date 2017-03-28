package factory;

import units.Unit;

import java.io.Serializable;

/**
 * Created by minorius on 02.03.2017.
 */
public interface UnitFactory extends Serializable {
    long serialVersionUID = 5008632469733847506L;
    Unit createUnit();
}

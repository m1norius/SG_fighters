package units;

import java.io.Serializable;

/**
 * Created by minorius on 02.03.2017.
 */
public interface Unit extends Serializable {

    long serialVersionUID = 5008632469733847506L;

    void pumpUnit();
    int attack();
    boolean defense();
    void setName();
    void getName();

    void setFullHP();
    int getHP();
    void setDamage(int damage);
}

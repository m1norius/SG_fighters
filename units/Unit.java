package units;

/**
 * Created by minorius on 02.03.2017.
 */
public interface Unit {
    void pumpUnit();
    int attack();
    boolean defense();
    void setName();
    void getName();

    void setFullHP();
    int getHP();
    void setDamage(int damage);
}

package move.Physical;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    //Lowers the target's Speed by one stage.
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "use Low Sweep";
    }
}
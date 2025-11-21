package move.Special;

import ru.ifmo.se.pokemon.*;

public class AuroraBeam extends SpecialMove {
    //Has a 10% chance to lower the target's Attack by one stage.
    public AuroraBeam() {
        super(Type.ICE, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return "use Aurora Beam";
    }
}
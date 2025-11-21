package move.Status;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    //Raises the user's Special Attack and Special Defense by one stage.
    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, +1);
        p.setMod(Stat.SPECIAL_DEFENSE, +1);
    }

    @Override
    protected String describe() {
        return "Use Calm Mind";
    }
}
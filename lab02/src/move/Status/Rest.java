package move.Status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    //User sleeps for two turns, completely healing itself.
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect sleep = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(sleep);
        int heal_fullHP = (int) (p.getStat(Stat.HP) - p.getHP());
        p.setMod(Stat.HP, heal_fullHP);

    }

    @Override
    protected String describe() {
        return "use Rest";
    }
}

package move.Status;

import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {
    //Heals the user by half its max HP.
    public SlackOff() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double heal = p.getStat(Stat.HP) / 2;
        p.setMod(Stat.HP, (int) heal);
    }

    @Override
    protected String describe() {
        return "use Slack Off";
    }
}

package move.Special;

import ru.ifmo.se.pokemon.*;

public class DisarmingVoice extends SpecialMove {
    //Inflicts regular damage. Ignores accuracy and evasion.
    public DisarmingVoice() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "Use Disarming Voice";
    }
}
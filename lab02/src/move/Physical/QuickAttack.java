package move.Physical;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    //Inflicts regular damage with no additional effect.
    public QuickAttack() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "Use Wick Attack";
    }
}
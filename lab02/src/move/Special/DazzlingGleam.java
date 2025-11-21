package move.Special;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    //Inflicts regular damage with no additional effect.
    public DazzlingGleam() {
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected String describe() {
        return "Use Dazzling Gleam";
    }
}
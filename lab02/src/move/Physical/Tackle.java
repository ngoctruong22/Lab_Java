package move.Physical;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    //Inflicts regular damage with no additional effect.
    public Tackle() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "use Tackle";
    }
}

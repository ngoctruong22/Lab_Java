package move.Physical;

import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {
    //Inflicts regular damage with no additional effect.
    public Pound() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "Pound";
    }
}
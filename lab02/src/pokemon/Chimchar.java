package pokemon;

import move.Physical.LowSweep;
import move.Status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);
        this.setType(Type.FIRE);
        this.setStats(44, 58, 44, 58, 44, 61);
        this.setMove(
                new Rest(),
                new LowSweep()

        );

    }
}
package pokemon;

import move.Physical.LowSweep;
import move.Status.Rest;
import move.Status.SlackOff;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Pokemon {
    public Monferno(String name, int level) {
        super(name, level);
        this.setType(Type.FIRE);
        this.setType(Type.FIGHTING);
        this.setStats(64, 78, 52, 78, 52, 81);
        this.setMove(
                new Rest(),
                new LowSweep(),
                new SlackOff()
        );

    }
}
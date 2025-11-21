package pokemon;

import move.Physical.LowSweep;
import move.Status.CalmMind;
import move.Status.Rest;
import move.Status.SlackOff;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Pokemon {
    public Infernape(String name, int level) {
        super(name, level);
        this.setType(Type.FIRE);
        this.setType(Type.FIGHTING);
        this.setStats(76, 104, 71, 104, 71, 108);
        this.setMove(
                new Rest(),
                new LowSweep(),
                new SlackOff(),
                new CalmMind()

        );

    }
}
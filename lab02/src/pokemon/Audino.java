package pokemon;

import move.Physical.Pound;
import move.Special.DazzlingGleam;
import move.Special.DisarmingVoice;
import move.Status.CalmMind;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Audino extends Pokemon {
    public Audino(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(103, 60, 86, 60, 86, 50);
        this.setMove(
                new Pound(),
                new DazzlingGleam(),
                new CalmMind(),
                new DisarmingVoice()
        );

    }
}
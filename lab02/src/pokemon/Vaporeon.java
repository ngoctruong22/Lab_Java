package pokemon;

import move.Physical.QuickAttack;
import move.Physical.Tackle;
import move.Special.AuroraBeam;
import move.Status.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vaporeon extends Pokemon {
    public Vaporeon(String name, int level) {
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(130, 65, 60, 110, 95, 65);
        this.setMove(
                new QuickAttack(),
                new WorkUp(),
                new Tackle(),
                new AuroraBeam()

        );

    }
}
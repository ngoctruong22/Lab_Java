package pokemon;

import move.Physical.QuickAttack;
import move.Physical.Tackle;
import move.Status.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class Eevee extends Pokemon {
    public Eevee(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(55, 55, 50, 45, 65, 55);
        this.setMove(
                new QuickAttack(),
                new WorkUp(),
                new Tackle()

        );
        Effect e = new Effect().stat(Stat.ATTACK, 1);
        this.addEffect(e);


    }


}

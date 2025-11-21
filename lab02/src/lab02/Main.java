package lab02;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
public class Main {

    public static void main(String[] args){

        Battle b = new ru.ifmo.se.pokemon.Battle();
        Pokemon p1 = new Audino("Audino", 10);
        Pokemon p2 = new Chimchar("Chimchar",10 );
        Pokemon p3 = new Eevee("Eevee", 10);
        Pokemon p4 = new Infernape("Infernape", 10);
        Pokemon p5 = new Monferno("Monferno", 10);
        Pokemon p6 = new Vaporeon("Vaporeon", 10);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
package bug;

import ru.ifmo.se.pokemon.*;

public class wimpod extends Pokemon {
    public wimpod(String name, int level) {
        super(name, level);
        setStats(25, 35, 40, 20, 30, 80);
        setType(Type.BUG, Type.WATER);
        setMove(new Facade(), new Waterfall(), new Double_Team() );
    }
}
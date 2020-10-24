package bug;

import ru.ifmo.se.pokemon.*;

public class golisopod extends wimpod {
    public golisopod(String name, int level) {
        super(name, level);
        setStats(75, 125, 140, 60, 90, 40);
        setType(Type.BUG, Type.WATER);
        setMove(new Facade(), new Waterfall(), new Double_Team(), new Liquidation() );
    }
}
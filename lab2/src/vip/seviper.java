package vip;

import ru.ifmo.se.pokemon.*;

public class seviper extends Pokemon {
    public seviper(String name, int level) {
        super(name, level);
        setStats(73, 100, 60, 100, 60, 65);
        setType(Type.POISON);
        setMove(new Poison_Tail(),new Swagger1(), new Rest1(), new Dark_Pulse());
    }
}

package clef;
import ru.ifmo.se.pokemon.*;

public class cleffa extends Pokemon {
    public cleffa(String name, int level) {
        super(name, level);
        setStats(50, 25, 28, 45, 55, 15);
        setType(Type.FAIRY);
        setMove(new Flamethrower(), new Sing() );
    }
}
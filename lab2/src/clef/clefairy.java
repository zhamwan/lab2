package clef;
import ru.ifmo.se.pokemon.*;

public class clefairy extends cleffa {
    public clefairy(String name, int level) {
        super(name, level);
        setStats(70, 45, 48, 60, 65, 35);
        setType(Type.FAIRY);
        setMove(new Flamethrower(), new Sing(), new Wake_Up_Slap() );
    }
}
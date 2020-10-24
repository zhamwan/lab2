package clef;
import ru.ifmo.se.pokemon.*;


public class clefable extends clefairy {
    public clefable(String name, int level) {
        super(name, level);
        setStats(95, 70, 73, 95, 90, 60);
        setType(Type.FAIRY);
        setMove(new Flamethrower(), new Sing(), new Wake_Up_Slap(), new Thunder() );
    }
}
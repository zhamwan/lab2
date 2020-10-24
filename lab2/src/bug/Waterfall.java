package bug;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove{
    public Waterfall(){
        super(Type.WATER, 80, 100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2);
        if (e.success()) Effect.flinch(p);  ;
    }
    public String describe(){
        return "применяет Waterfall";
    }
}


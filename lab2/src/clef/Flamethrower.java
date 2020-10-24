package clef;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove{
    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1);
        if (e.success())  Effect.burn(p);
    }
    public String describe(){
        return "применяет Flamethrower";
    }
}
package clef;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove{
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.3);
        if (e.success()) Effect.paralyze(p);

    }
    public String describe(){
        return "применяет Thunder";
    }
}
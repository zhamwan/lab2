package clef;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove{
    public Sing(){
        super(Type.NORMAL, 0, 55);
    }
    protected void applyOppEffects(Pokemon p){
        if (checkAccuracy(p,p))  Effect.sleep(p);
    }
    public String describe(){
        return "применяет Sing";
    }
}
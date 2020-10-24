package vip;

import ru.ifmo.se.pokemon.*;

public class Dark_Pulse extends SpecialMove{
    public Dark_Pulse(){
        super(Type.DARK, 80, 100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2).turns(1);
        if (e.success())  Effect.flinch(p);
    }
    public String describe(){
        return "применяет Dark Pulse";
    }
}
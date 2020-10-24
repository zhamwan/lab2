package vip;

import ru.ifmo.se.pokemon.*;

public class Swagger1 extends StatusMove{
    public Swagger1(){
        super(Type.NORMAL, 0, 90);
    }
    public void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }
    public String describe(){
        return "применяет Swagger";
    }
}
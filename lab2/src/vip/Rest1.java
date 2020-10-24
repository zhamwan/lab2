package vip;

import ru.ifmo.se.pokemon.*;

public class Rest1 extends StatusMove{
    public Rest1(){
        super(Type.PSYCHIC, 0, 0);
    }
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(2).stat(Stat.HP, 73);
        e.sleep(p);
    }
    public String describe(){
        return "применяет Rest";
    }
}
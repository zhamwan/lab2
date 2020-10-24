package bug;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (p.getCondition()==Status.SLEEP || p.getCondition()==Status.PARALYZE || p.getCondition()==Status.POISON  )  p.setMod(Stat.HP, -70);
    }
    public String describe(){
        return "применяет Facade";
    }
}


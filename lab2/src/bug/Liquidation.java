package bug;

import ru.ifmo.se.pokemon.*;

public class Liquidation extends PhysicalMove{
    public Liquidation(){
        super(Type.WATER, 85, 100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2);
        if (e.success()) p.setMod(Stat.DEFENSE, -1);

    }
    public String describe(){
        return "применяет Liquidation";
    }
}
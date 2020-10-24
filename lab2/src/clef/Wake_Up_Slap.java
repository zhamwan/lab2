package clef;

import ru.ifmo.se.pokemon.*;

public class Wake_Up_Slap extends SpecialMove{
    public Wake_Up_Slap(){
        super(Type.PSYCHIC, 70, 100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect();
        if (p.getCondition()==Status.SLEEP)  {
            p.setCondition(e);
            p.setMod(Stat.HP, -70);
        }

    }
    public String describe(){
        return "применяет Wake_Up_Slap";
    }
}
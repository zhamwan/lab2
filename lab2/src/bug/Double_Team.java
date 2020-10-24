package bug;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove{
    public Double_Team(){
        super(Type.NORMAL, 0, 0);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    public String describe(){
        return "применяет Double_Team";
    }
}


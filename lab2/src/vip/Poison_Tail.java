package vip;

import ru.ifmo.se.pokemon.*;

public class Poison_Tail extends StatusMove{
        public Poison_Tail(){
            super(Type.PSYCHIC, 50, 100);
        }
        protected void applyOppEffects(Pokemon p){
            Effect e = new Effect().chance(0.1).turns(1);
            if (e.success())  Effect.poison(p);
        }
        public String describe(){
            return "применяет Poison Tail";
    }
}


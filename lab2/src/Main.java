import ru.ifmo.se.pokemon.*;
import clef.*;
import vip.*;
import bug.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new seviper("Vupsen", 17);
        Pokemon p2 = new cleffa("Pupsen", 9);
        b.addAlly(p1);
        b.addFoe(p2);
        Pokemon p3 = new wimpod("BOBA", 34);
        Pokemon p4 = new clefable("BIBA", 19);
        b.addAlly(p3);
        b.addFoe(p4);
        Pokemon p5 = new golisopod("l", 21);
        Pokemon p6 = new clefairy("Хp", 14);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
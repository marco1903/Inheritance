package sr.unasat.inheritance.app;

import sr.unasat.inheritance.concrete.Raiden;
import sr.unasat.inheritance.entities.Character;
import sr.unasat.inheritance.entities.Scorpion;

public class Application {
    public static void main(String[] args) {
        Character c = new Character();
        c.kick();

        Scorpion s = new Scorpion();
        s.kick();
        System.out.println();

        // Concrete
        Raiden r = new Raiden();
        r.kick();
        System.out.println();

        // Abstract
        sr.unasat.inheritance.abstract_.Raiden abstr = new sr.unasat.inheritance.abstract_.Raiden();
        abstr.fight();
        abstr.moveForward();
        abstr.speaks();
        System.out.println();


        // Interface
        sr.unasat.inheritance.interface_.Raiden interf = new sr.unasat.inheritance.interface_.Raiden();
        interf.fight();
        interf.moveForward();
        interf.speaks();
        System.out.println();

    }
}

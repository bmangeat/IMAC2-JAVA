package fr.umlv.fight;

public class Arena {

    public void fight(Robot r1, Robot r2){
        while (!r1.isDead() && !r2.isDead()){
            r1.fire(r2);
            r2.fire(r1);
        }
    }
}

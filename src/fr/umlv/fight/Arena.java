package fr.umlv.fight;

public class Arena {


    /**
     * Fight between two robots
     * @param r1 First robot which starts to fire
     * @param r2 Second robot which can repost after
     */

    public void fight(Robot r1, Robot r2){
        while (!r1.isDead() && !r2.isDead()){
            r1.fire(r2);
            r2.fire(r1);
        }
    }
}

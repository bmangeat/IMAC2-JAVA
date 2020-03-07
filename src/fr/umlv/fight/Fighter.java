package fr.umlv.fight;

import java.util.Random;

public class Fighter extends Robot {
    private final Random _seed;

    /**
     * Constructor of robot. Set name and lifepoint
     * @param name
     */
    public Fighter(String name) {
        super(name);
        _seed = new Random();
    }

    @Override
    protected boolean rollDice() {
        return _seed.nextBoolean();
    }

    @Override
    public String toString() {
        return "Fighter " + get_name();
    }
}

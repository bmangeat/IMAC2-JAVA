package fr.umlv.fight;

public class Main {
    public static void main(String[] args) {
        // Create objects
        var d2r2 = new Robot("D2R2");
        var data = new Robot("Data");
        var bob = new Fighter("Bob");
        var kevin = new Fighter("Kevin");
        var arena = new Arena();

        // arena.fight(d2r2, data);
        // arena.fight(d2r2, bob);
        arena.fight(kevin, bob);


    }
}

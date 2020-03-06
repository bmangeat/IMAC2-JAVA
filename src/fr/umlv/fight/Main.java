package fr.umlv.fight;

public class Main {
    public static void main(String[] args) {
        // Create objects
        var d2r2 = new Robot("D2R2");
        var data = new Robot("Data");
        var arena = new Arena();

        arena.fight(d2r2, data);

    }
}

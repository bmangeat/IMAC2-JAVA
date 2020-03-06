package fr.umlv.fight;

import java.util.Objects;

public class Robot {
    private int _lifePoint;
    private String _name;

    /**
     * Constructor of robot. Set name and lifepoint
     * @param name
     */
    public Robot(String name){
        this._name = Objects.requireNonNull(name);
        this._lifePoint = 10;
    }

    public String get_name() { return _name; }
    public int get_lifePoint() { return _lifePoint; }

    /**
     * Set name to object Robot
     * @param _name
     */
    public void set_name(String _name) { this._name = _name; }

    /**
     * Set lifepoint to object Robot
     * @param _lifePoint
     */
    public void set_lifePoint(int _lifePoint) { this._lifePoint = _lifePoint; }

    /**
     * Targetrobot in param takes 2 damages on its health
     * @param targetRobot
     */
    public void fire(Robot targetRobot){
        if (!isDead()){
            targetRobot.set_lifePoint(targetRobot.get_lifePoint() - 2);
            System.out.println(targetRobot + "a été touché par le " + get_name());
        } else {
            System.out.println("Hého ! Vous ne pouvez pas tirer sur un mort !");
        }
    }

    /**
     * De
     * @return boolean which shows if the robot is dead or not
     */
    public boolean isDead(){
        if (get_lifePoint() == 0){
            System.out.println(get_name() + " est mort.");
            return true;
        } else{
            return false;
        }
    }

    /**
     * Redifine toString's method of robot object
     * @return string with name of the robot
     */
    @Override
    public String toString() {
        return "Robot" + get_name();
    }
}

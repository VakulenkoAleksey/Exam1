package test;

public class Bear extends WildAnimals {

    public Bear(String name, int weight, int speed, int power) {
        super(name, weight, speed);
        setPower(power);
    }
}

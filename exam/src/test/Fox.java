package test;

public class Fox extends WildAnimals {


    public Fox(String name, int weight, int speed, int power) {
        super(name, weight, speed);
        setPower(power);
    }
}

package test;

public class Wolf extends WildAnimals {
    public Wolf(String name, int weight, int speed, int power) {
        super(name, weight, speed);
        setPower(power);
    }
}


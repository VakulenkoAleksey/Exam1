package test;

public class Bunny extends Pets implements ForFood {

    public Bunny(String name, int weight, int speed, int health, boolean eaten) {
        getName(name);
        getWeight(weight);
        getSpeed(speed);
        getHealth(health);
        getResource(0);
        isEaten(eaten);
    }


    @Override
    public void toBeEaten() {

    }


}

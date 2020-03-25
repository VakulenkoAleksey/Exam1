package test;

public class Chicken extends Pets implements CanGiveResource {

    public Chicken(String name, int weight, int speed, int health, boolean eaten) {
        getName(name);
        getWeight(weight);
        getSpeed(speed);
        getHealth(health);
        getResource(weight);
        isEaten(eaten);
    }

    @Override
    public int giveResource() {
        return resource;
    }

    @Override
    public void toBeEaten() {

    }


}

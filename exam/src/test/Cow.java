package test;

public class Cow extends Pets implements ForFood, CanGiveResource {
    public Cow(String name, int weight, int speed, int health, boolean eaten) {
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
